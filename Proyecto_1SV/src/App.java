//import pe.edu.upeu.SubProgramas;
//import pe.edu.upeu.ProjecTest;
import pe.edu.upeu.recur.subprograma;
import pe.edu.upeu.util.Teclado;
public class App {
    

    public static void main(String[] args) throws Exception {
        //SubProgramas objSP=new SubProgramas();
        
        System.out.println("Hello, World! ");
        //objSP.funcionExponencial();
        //new SubProgramas().funcionExponencial();
        Teclado tec=new Teclado();
        subprograma objSP=new subprograma();
        int numero=tec.leer(0, "Ingrese un numero");
        System.out.println("Factorial Iterativo:"+objSP.factorialBig(numero));
        System.out.println("Factorial Recursivo:"+objSP.factorialRecurvBig(numero));
    
    }
}
