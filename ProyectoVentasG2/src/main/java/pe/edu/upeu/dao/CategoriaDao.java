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
        ut.clearConsole();
        catTO=new CategoriaTO();
        ut.pintarLine('H', 16);
        System.out.println("|------ Registrar Categoria -----|");
        ut.pintarLine('H', 16);
        ler=new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(ler, 0, "C", 1));
        catTO.setNombre(lte.leer("","| Nombre de categoria: "));
        ut.pintarLine('H', 16);
        return agregarContenido(ler, catTO);
    }
    
    public void reporteCategoria(Object[][] data) {
        System.out.println("-------Reporte de Categoria-------");
        //lar=new LeerArchivo("Categoria.txt");
        //listarContenido(aq);
        imprimirLista(data);
    }

    public void reporteCategoria(){
        System.out.println("--- Reporte de Categoria ---");
        //ler=new LeerArchivo("Categoria.txt");
        //imprimirLista(data);
        ler=new LeerArchivo("Categoria.txt");
        Object[][] data=listarContenido(ler);
        String dataX="";
        ut.pintarLine('H', 13);
        ut.pintarTextHeadBody('H', 3,  "    ID,   Nombre");
        System.out.println("");
        ut.pintarLine('H',13);
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[0].length; j++){
                if(j==0){
                    dataX+="     "+data[i][j];
                }else{
                    dataX+=","+data[i][j];
                }
            }
            ut.pintarTextHeadBody('B', 3, dataX);
            dataX="";
        }ut.pintarLine('H',13);
    }
}
