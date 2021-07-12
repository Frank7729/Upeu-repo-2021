package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class CategoriaDao extends AppCrud {
   
    LeerArchivo ler;
    CategoriaTO catTO;
    
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public Object[][] crearCategoria(){
        catTO=new CategoriaTO();
        System.out.println("-------Registro de Categoria-------");
        ler=new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(ler, 0, "C", 1));
        catTO.setNombre(lte.leer("","Ingrese nombre de categoria: "));
        return agregarContenido(ler, catTO);
    }
    
    public void reporteCategoria(Object[][] data) {
        System.out.println("-------Reporte de Categoria-------");
        //lar=new LeerArchivo("Categoria.txt");
        //listarContenido(aq);
        imprimirLista(data);
    }

    public void reporteCategoria(){
        System.out.println("----- Reporte de Categoria ----");
        //ler=new LeerArchivo("Categoria.txt");
        //imprimirLista(data);
        ler=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(ler);
        String dataX="";
        ut.pintarLine('H', 15);
        ut.pintarTextHeadBody('H', 3,  "    ID,   Nombre");
        System.out.println("");
        ut.pintarLine('H',15);
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[0].length; j++){
                if(j==0){
                    dataX+=""+data[i][j];
                }else{
                    dataX+=","+data[i][j];
                }
            }
            ut.pintarTextHeadBody('B', 3, dataX);
            dataX="";
        }
    }
}
