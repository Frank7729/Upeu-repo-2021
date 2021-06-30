package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
    LeerArchivo ler;
    ProductoTO proTO;
    
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void crearProducto(){
        proTO=new ProductoTO();
        System.out.println("sdfndjflk");
        proTO.setNombre(lte.leer("","Ingrese el nombre del producto: "));
        mostrarCategoria();
        proTO.setIdCateg(lte.leer("","Elija el id de Categoria: "));
        ler=new LeerArchivo("Producto.txt");
        proTO.setIdProducto(generarId(ler, 0, "P", 1));
        proTO.setUnidadMed(lte.leer("","Ingrese Unidad de Medida"));
        proTO.setPrecioUnit(lte.leer(0.0,"Ingrese el precio Unitario"));
        proTO.setPorceUtil(lte.leer(0.0,"Ingrese el porcentaje de utilidad"));
        proTO.setStock(lte.leer(0.0,"Ingrese "));
        ler=new LeerArchivo("Producto.txt");
        agregarContenido(ler, proTO);
    }
    
    public void reporteProducto(){
        ler=new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(ler);
        String dataX="";
        ut.pintarLine('H', 32);
        ut.pintarTextHeadBody('H', 2,  "    ID,   Nombre,U.Mod,IdCat,P.Unit,P.Utilidad");
        System.out.println("");
        ut.pintarLine('H',32);
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[0].length; j++){
                if(j==0){
                    dataX+=""+data[i][j];
                }else{
                    dataX+=","+data[i][j];
                }
            }
            ut.pintarTextHeadBody('B', 2, dataX);
            dataX="";
        }
    }

    public void mostrarCategoria(){
        ler=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(ler);
        for(int i=0; i<data.length; i++){
            System.out.print(data[i][0]+"="+data[i][1]+", ");
        }
        System.out.println("");
    }
}
