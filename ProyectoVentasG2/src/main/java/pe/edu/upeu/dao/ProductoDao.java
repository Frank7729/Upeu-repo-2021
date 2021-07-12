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
    
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public Object[][] crearProducto() {
        System.out.println("-------------Registro de Productos------------");
        mostrarCategoria();
        proTO=new ProductoTO();        
        ler=new LeerArchivo("Producto.txt");        
        proTO.setIdCateg(lte.leer("", "Ingrese el Id de categoria:"));
        proTO.setIdProducto(generarId(ler, 0, "P", 1));
        proTO.setNombre(lte.leer("", "Ingrese nombre del Producto:"));  
        proTO.setUnidadMed(lte.leer("", "Ingrese Unidad medida:"));
        proTO.setPorceUtil(lte.leer(0.0, "Ingrese el porcentaje de utilidad:"));      
        proTO.setPrecioUnit(lte.leer(0.0, "Ingrese Precio Unitario:"));
        proTO.setStock(lte.leer(0.0, "Ingrese el stock:"));
        ler=new LeerArchivo("Producto.txt");     
        return agregarContenido(ler, proTO);
    }
    
    public void mostrarCategoria() {
        ler=new LeerArchivo("Categoria.txt"); 
        Object[][] data=listarContenido(ler);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][0]+"="+data[i][1]+",");
        }
        System.out.println("");
    }

    public void reporteProducto() {
        System.out.println("---------------------------Reporte de Productos--------------------------");
        ler=new LeerArchivo("Producto.txt");
       Object[][] data=listarContenido(ler);
        String dataX="";
        ut.pintarLine('H',36);
        ut.pintarTextHeadBody('H', 2, "ID,Noombre,U.Medida,IdCat,P.Unit,%.Util,Stock"); 
        System.out.println("");
        ut.pintarLine('H',36);
       
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
       ut.pintarLine('H',36);       
    }
}
