package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud{
    LeerArchivo ler;
    ProductoDao proTO;
    VentaTO venTO;
    VentaDetalleTO vedTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");

    public void registroVenta(){
        venTO=new VentaTO();
        ler=new LeerArchivo("Venta.txt");
        venTO.setIdVenta(generarId(ler, 0, "V", 1));
        venTO.setDniCliente(lte.leer("","Ingrese el Dni del cliente "));
        venTO.setFechaVenta(formato.format(new Date()));
        venTO.setNetoTotal(0.0);
        venTO.setIgv(0.0);
        venTO.setPrecioTotal(0.0);
        ler=new LeerArchivo("Venta.txt");
        agregarContenido(ler, venTO);

    }

    public void registroDetalleVenta(){

    }
    
}
