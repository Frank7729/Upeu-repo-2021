package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
//import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
    LeerArchivo ler;
    ProductoTO proTO;
    //agregarContenido(ler, proTO);Preba
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public Object[][] crearProducto() {
        ut.clearConsole();
        System.out.println("-------------Registrar Productos------------");
        //mostrarCategoria();
        mostrarcategoria1();
        proTO=new ProductoTO();        
        ler=new LeerArchivo("Producto.txt");   
        System.out.println("-------- Ingrese datos del Producto --------");     
        proTO.setIdCateg(lte.leer("", "Id de categoria: "));
        proTO.setIdProducto(generarId(ler, 0, "P", 1));
        proTO.setNombre(lte.leer("", "Nombre: "));  
        proTO.setUnidadMed(lte.leer("", "Unidad medida: "));
        proTO.setPorceUtil(lte.leer(0.0, "% utilidad: "));      
        proTO.setPrecioUnit(lte.leer(0.0, "Precio Unitario: "));
        proTO.setStock(lte.leer(0.0, "Stock: "));
        ut.clearConsole();
        ler=new LeerArchivo("Producto.txt");          
        return agregarContenido1(ler, proTO);
    }

    public void mostrarcategoria1() {
        ler=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(ler);
        String dataX="";
        System.out.println("--------------------");
        ut.pintarTextHeadBody('H', 2, " IdCatg,Nombre"); 
        System.out.println("");
        System.out.println("--------------------");       
       for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[0].length; j++) {
               if(j==0){
                dataX+="   "+data[i][j];
               }else{
                dataX+=","+data[i][j]; 
               }               
           }
           ut.pintarTextHeadBody('B', 2, dataX);  
           dataX="";
       } 
       System.out.println("--------------------");      
    }


    public void reporteProducto() {
        System.out.println("------------------------ Reporte de Productos -----------------------");
        ler=new LeerArchivo("Producto.txt");
       Object[][] data=listarContenido(ler);
        String dataX="";
        ut.pintarLine('H',34);
        ut.pintarTextHeadBody('H', 2, "ID,Noombre,U.Medida,IdCat,P.Unit,%.Util,Stock"); 
        System.out.println("");
        ut.pintarLine('H',34);
       
       for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[0].length; j++) {
               if(j==0){
                dataX+=""+data[i][j];
               }else{
                dataX+=","+data[i][j]; 
               }               
           }
           ut.pintarTextHeadBody('B', 2, dataX);  
           dataX="";
       } 
       ut.pintarLine('H',34);       
    }
}
