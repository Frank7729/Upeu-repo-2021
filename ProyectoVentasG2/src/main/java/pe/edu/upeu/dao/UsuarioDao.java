package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.UtilsX;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.modelo.UsuarioTO;

public class UsuarioDao extends AppCrud{
    LeerArchivo ler;
    UsuarioTO usTO;
    
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public void crearNuevoUsuario(){
        usTO=new UsuarioTO();
        ler=new LeerArchivo("Usuario.txt");
        String user=lte.leer("","Ingrese un usuario: ").toLowerCase();  
        if(validarExistUser(user)){
            usTO.setUsuario(user);
            usTO.setIdUsuario(generarId(ler, 0, "U", 1));
            usTO.setPerfil(lte.leer("", "Ingrese el Perfil del Usuario (ADMIN, VENDEDOR):").toUpperCase());        
            Console  constx= System.console();
            System.out.println("Ingrese Clave:");
            char[] clave=constx.readPassword();
            usTO.setClave(String.valueOf(clave));
            agregarContenido(ler, usTO);            
        }else{
           System.out.println("Eliga otro usuario:"); 
           crearNuevoUsuario();
        }       
    }

    public boolean login(String usuario, char[] clave){
        ler=new LeerArchivo("Usuario.txt");
        Object[][] data=buscarContenido(ler, 1, usuario);
        if(data.length==1 && data[0][2].equals(String.valueOf(clave))){
            return true;
        }
        return false;
    }

    public boolean validarExistUser(String user) {
        ler=new LeerArchivo("Usuario.txt");
       Object[][] data=buscarContenido(ler, 1, user);  
       if(data!=null && data.length>0){
           System.out.println("-----ya existe otro usuario con ese nombre-----");
        return false;
       }
       return true;
    }
}
