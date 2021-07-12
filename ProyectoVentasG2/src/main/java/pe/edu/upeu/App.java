package pe.edu.upeu;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
//import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
//import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
//import static org.fusesource.jansi.Ansi.*;
//import static org.fusesource.jansi.Ansi.Color.*;

/**
 * Hello world!
 *
 */
public class App{
    
    public static void registrarCategoria(CategoriaTO categ){
        System.out.println("------Registro de Categoria de Productos----");
        System.out.println("IDCateg:"+categ.getIdCateg()+ "\tNomnbre:"+categ.getNombre());
    
    }

    public static void menuMain(){
        String mensaje="\nSeleccione el algoritmo que desea ejecutar:"+
        "\n1 = Registrar Categoria"+
        " \n 12 = Reportar Categoria"+
        "\n2 = Registrar Productos"+
        " \n 21 = Reportar Productos"+
        " \n 22 = Modificar Productos"+
        "\n3 = Realizar Venta"+
        " \n 31 = Reporte Venta/Fecha"+
        "\n4 = Registrar Usuario"+
        "\n0 = Salir del programa";
        LeerTeclado lt=new LeerTeclado();
        UtilsX ut=new UtilsX();
        CategoriaDao daoC;
        UsuarioDao daoUsu;
        ProductoDao daoPro;
        VentaDao daoVent;
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{           
            switch(opcion){
                case 1:daoC=new CategoriaDao();daoC.crearCategoria();break;
                case 12:ut.clearConsole();daoC=new CategoriaDao();daoC.reporteCategoria();break;
                case 2:daoPro=new ProductoDao();daoPro.crearProducto(); break;
                case 21:ut.clearConsole();daoPro=new ProductoDao();daoPro.reporteProducto(); break;
                case 3:daoVent=new VentaDao();daoVent.registroVentaGeneral(); break;
                case 31:ut.clearConsole();daoVent=new VentaDao();daoVent.reporteVentasRangoFecha();break;
                case 4:daoUsu=new UsuarioDao();daoUsu.crearNuevoUsuario(); break;
                //case 5:daoVent=new VentaDao();daoVent.registroVenta(); ;break;
                default:System.out.println("La opcion que eligio no existe: "); 
                break;
            }
            if(opcion!=0){
                if(lt.leer("", "\nDesea seguir probando SI=S/NO=N:").toUpperCase().charAt(0)=='S'){
                    opcion=lt.leer(0, mensaje);
                }else{
                    opcion=0;
                }  
            }
        }while(opcion!=0);
        ut.clearConsole();        
    }

    public static void ValidarAcceso(){
        LeerTeclado lt=new LeerTeclado();
        Console constx= System.console();
        String usuario=lt.leer("","Ingrese su usuario: ");
        System.out.println("Ingrese su clave: ");
        char[] clave=constx.readPassword();
        UsuarioDao usuDao=new UsuarioDao();
        if(usuDao.login(usuario, clave)){
            menuMain();
        }else{
            System.out.println("Ingrese nuevamente: ");
            ValidarAcceso();
        }
        
    }

    public static void main( String[] args ){   
        AnsiConsole.systemInstall();
        Ansi colorX=new Ansi();
        System.out.println(colorX.bgBrightGreen().fgBlue().a("***************Ingreso al Sistema***********").reset());
        //AnsiConsole.systemInstall();
        //System.out.println(colorX.render("@|red Hello|@ gggg @|green World|@") );
        ValidarAcceso();       
        //menuMain(); 
        //new MainGUI();

        //menuMain();
        //new MainGUI();
    }
}

