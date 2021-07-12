package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
//import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
//import static org.fusesource.jansi.Ansi.*;
//import static org.fusesource.jansi.Ansi.Color.*;

public class VentaDao extends AppCrud{
    LeerArchivo ler;
    ProductoDao proTO;
    VentaTO venTO;
    VentaDetalleTO vedTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");

    public void registroVentaGeneral(){
        String venta="S1";
        VentaTO ven=crearVenta();
        double preciototal=0;
        do{
            VentaDetalleTO vt=carritoVentas(ven);
            preciototal=preciototal+vt.getPrecioTotal();
            venta=lte.leer("", "Algo mas (Si=S/No=N)?").toUpperCase();
        }while(venta.charAt(0)=='S');
        ven.setPrecioTotal(preciototal);
        ven.setNetoTotal((Math.round((ven.getPrecioTotal()/1.18)*100.0)/100));
        ven.setIgv((Math.round((ven.getNetoTotal()*0.18)*100.0)/100.0));
        ler=new LeerArchivo("Venta.txt");
        ut.pintarLine('H',21);
        System.out.println("| Precio Neto "+"|    IGV    "+"| Total a pagar |");
        System.out.println("| S/."+ven.getNetoTotal()+"    | S/."+ven.getIgv()+"  | S/."+ven.getPrecioTotal()+"      |");
        ut.pintarLine('H',21);
        ut.pintarTextHeadBody('B', 4, venta);
        editarRegistro(ler, 0, ven.getIdVenta(), ven);
    }

    public VentaTO crearVenta(){
        System.out.println("************Registro de Venta****************");
        ler=new LeerArchivo("Venta.txt");
        venTO=new VentaTO();       
        venTO.setIdVenta(generarId(ler, 0, "V", 1));
        venTO.setDniCliente(lte.leer("","Ingrese el Dni del cliente "));
        venTO.setFechaVenta(formato.format(new Date()));
        venTO.setIgv(0.0);
        venTO.setNetoTotal(0.0);
        venTO.setPrecioTotal(0.0);
        ler=new LeerArchivo("Venta.txt");
        agregarContenido(ler, venTO);
        return venTO;
    }

    public VentaDetalleTO carritoVentas(VentaTO vTO){
        mostrarProductos();
        vedTO=new VentaDetalleTO();
        ler=new LeerArchivo("VentaDetalle.txt");
        vedTO.setIdVentaDetalle(generarId(ler, 0, "VD", 2));
        vedTO.setIdProducto(lte.leer("", "Ingrese Id Producto: "));
        vedTO.setIdVenta(vTO.getIdVenta());
        LeerArchivo larX=new LeerArchivo("Producto.txt");
        Object[][] dataProd=buscarContenido(larX, 0, vedTO.getIdProducto());
        double porcentUt=Double.parseDouble(String.valueOf(dataProd[0][5]));
        double precioUnit=Double.parseDouble(String.valueOf(dataProd[0][4]));
        vedTO.setPoceUtil(porcentUt);
        vedTO.setCantidad(lte.leer(0.0, "Ingrese cantidad: "));
        vedTO.setPrecioUnit((Math.round((precioUnit+precioUnit*porcentUt)*100.0)/100.0));
        vedTO.setPrecioTotal((Math.round((vedTO.getCantidad()*vedTO.getPrecioUnit())*100.0)/100.0));
        ler=new LeerArchivo("VentaDetalle.txt");
        agregarContenido(ler, vedTO);
        return vedTO;
    }

    public void mostrarProductos(){
        ut.clearConsole();
        System.out.println("Agregar Productos a carrito de Ventas");
        ler=new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(ler);
        for(int i=0; i<data.length; i++){
            if(Double.parseDouble(String.valueOf(data[i][6]))>0){
                System.out.print(data[i][0]+"="+data[i][1]+
                "(Precio:"+data[i][4]+" ,Stock:"+data[i][6]+"); ");
            }          
        }
        System.out.println("");
    }

    public void reporteVentasRangoFecha(){
        AnsiConsole.systemInstall();
        System.out.println("***********Reporte de Ventas por Fechas***********");
        String fechaIni=lte.leer("", "Ingrese Fecha Inicio:");
        String fechaFin=lte.leer("", "Ingrese Fecha Final:");
        ler=new LeerArchivo("Venta.txt");
        Object[][] dataV=listarContenido(ler);
        int contarventasRF=0;
        try {
            for(int fila=0; fila<dataV.length; fila++){
                String[] fechaventa=String.valueOf(dataV[fila][2]).split(" ");
                //System.out.println("Datos Fecha:"+fechaventa[0]+"  Fecha Teclado:"+formatoFecha.format(formatoFecha.parse(fechaIni)));
                Date fechaVentaX=formatoFecha.parse(fechaventa[0]);
                if(
                    (fechaVentaX.after(formatoFecha.parse(fechaIni)) || fechaventa[0].equals(fechaIni)) &&
                    (fechaVentaX.before(formatoFecha.parse(fechaFin)) || fechaventa[0].equals(fechaFin))
                    ){
                    contarventasRF=contarventasRF+1;
                }
            }
            Object[][] dataVRF=new Object[contarventasRF][dataV[0].length];
            int filaIndice=0;
            double netoTotalX=0, igvX=0, precioTotalX=0;
            for(int fila=0; fila<dataV.length; fila++){
                String[] fechaventa=String.valueOf(dataV[fila][2]).split(" ");
                Date fechaVentaX=formatoFecha.parse(fechaventa[0]);
                if(
                    (fechaVentaX.after(formatoFecha.parse(fechaIni)) || fechaventa[0].equals(fechaIni)) &&
                    (fechaVentaX.before(formatoFecha.parse(fechaFin)) || fechaventa[0].equals(fechaFin))
                    ){
                    for( int columna=0; columna<dataV[0].length; columna++){
                        dataVRF[filaIndice][columna]=dataV[fila][columna];
                        if(columna==3){netoTotalX+=Double.parseDouble(String.valueOf(dataV[fila][columna]));}
                        if(columna==4){igvX+=Double.parseDouble(String.valueOf(dataV[fila][columna]));}
                        if(columna==5){precioTotalX+=Double.parseDouble(String.valueOf(dataV[fila][columna]));}
                    }
                    filaIndice++;
                }
            }
            ut.clearConsole();
            //System.out.println("Datos"+dataVRF.length);
            System.out.println("----------------------------------Reporte de Ventas------------------------------------");
            System.out.println("                     ------Entre "+fechaIni+" a "+fechaFin+"------");
            ut.pintarLine('H', 43);
            ut.pintarTextHeadBody('H', 3, "ID,DNI Cliente,F.Venta,Imp.Neto,IGV,P.Total");
            System.out.println("");
            ut.pintarLine('H', 43);
            for(Object[] objects : dataVRF){
                String dataCadena=""+objects[0]+","+objects[1]+","+objects[2]+","+objects[3]+","+objects[4]+","+objects[5];
                ut.pintarTextHeadBody('B', 3, dataCadena);
            }
        System.out.println("");
        ut.pintarLine('H', 43);
        Ansi colorX=new Ansi();

        /*System.out.println("    T.Neto Ventas: S/."+(Math.round(netoTotalX*100.0)/100.0)+" | "+
        "T. IGV a pagar:S/."+(Math.round(igvX*100.0)/100.0)+" | "+"Monto Recaudado: S/."+(Math.round(precioTotalX*100.0)/100.0));
        ut.pintarLine('H', 43);*/
        
        System.out.println(colorX.render("@|red Total Neto Ventas: S/.|@ @|green "+(Math.round(netoTotalX*100.0)/100.0)+"|@ | @|red "+
        "Total IGV a pagar: S/.|@ @|green "+ (Math.round(igvX*100.0)/100.0)+"|@ | @|red "+"Monto Total: S/.|@ @|green "+
        (Math.round(precioTotalX*100.0)/100.0)+"|@"));
        ut.pintarLine('H', 43);  
        //System.out.println( ansi().fg(RED).a("Hello").fg(GREEN).a(" World").reset() );
        //System.out.println( ansi().render("@|red Hello|@ @|green World|@") );
        
        } catch (Exception e) {
        }
    }


}
