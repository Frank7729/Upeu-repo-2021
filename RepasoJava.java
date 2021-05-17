import java.util.Scanner;

public class RepasoJava {
    static Scanner objTecla1=new Scanner(System.in);
    static Scanner teclado=new Scanner(System.in);
    static int a=10;
    static double e=5;
    char b;
    short c;
    float d;
    long f;

public static void saludo3() {
    System.out.println("Dime tu nombre:");
    String nombre=objTecla1.next();
    System.out.println("Hola"+nombre);
}

public static void saludo4() {
    System.out.println("Hola Mundo");
}

public static void operacionBasicas(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Division:"+(a/e));
    System.out.println("Multiplicaion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));
}

public void operacionBasicas2(){
    System.out.println("Suma:"+(a+e));
    System.out.println("Resta:"+(a-e));
    System.out.println("Division:"+(a/e));
    System.out.println("Multiplicaion:"+(a*e));
    System.out.println("Potencia:"+(Math.pow(a, e)));

}

public static void saludo() {
    //definir Variables
      int contador=0;
      double numeros, sumaNumeros=0;
      //Datos de Entrada y proceso
     do{  //++contador:primero incrementa el valor     contador++: imprime el valor luego incrementa
          ++contador;
          System.out.println("Ingrese el valor de la posicion "+(contador)+":");
          numeros=teclado.nextDouble();
          sumaNumeros=sumaNumeros+numeros;
          
      } while(contador<10);
      //Datos de salida
      System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
  }    
    
  public static void saludo2() {
    //definir Variables
      double numeros, sumaNumeros=0;
      //Datos de Entrada y proceso
      for(int contador=1;contador<=10; contador++){
          System.out.println("Ingrese el valor de la posicion "+contador+":");
          numeros=teclado.nextDouble();
          sumaNumeros=sumaNumeros+numeros;              
      }
      //Datos de salida
      System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
  }       

    public static void menuMain(){
    String mensaje="Seleccion el algoritmo que desea ejecutar:"+
    "\n1=suma10NumerosMientras"+
    "\n2=suma10NumerosHacerMientras "+
    "\n3=suma10NumerosPara"+
    "\n0=Salir del programa";
    
    System.out.println(mensaje);
    int opcion=0;
    do{
        opcion=teclado.nextInt();
        switch(opcion){
            case 1: saludo();break;
            case 2: saludo2();break;
            case 3: saludo();break;
            case 4: saludo2();break;
        }
        if(opcion!=0)
        System.out.println("\n Desea seguir probando: "+mensaje);
        
    }while(opcion!=0);        
}

    public static void EJERCICIO123(){       
    char tipo, pago;
        double cant=0;
        double total=0;
        //Datos de entrada
        System.out.print("Ingrese el tipo de amburguesa\n\tS = Simple\n\tD = Doble\n\tT = Triple : ");
        tipo=teclado.next().charAt(0);
        System.out.print("Ingrese el tipo de pago\n\t1 = Efectivo\n\t2 = Tarjeta de Credito :");
        pago=teclado.next().charAt(0);
        System.out.print("Ingrese la cantidad de amburguesas: ");
        cant=teclado.nextDouble();
        //Proceso
        switch(tipo & pago){
            case 'S' & '2':{ total=(21*cant);} break;
            case 'D' & '2':{ total=(26.25*cant);} break;
            case 'T' & '2':{ total=(29.4*cant);} break;}
        switch(tipo & pago){
            case 'S' & '1':{ total=(20*cant);} break;
            case 'D' & '1':{ total=(25*cant);} break;
            case 'T' & '1':{ total=(28*cant);} break;}
        //Datos de salida
        System.out.println("El monto a pagar es: "+total);
        System.out.println("\n");
    }

public static void main(String[] args) {
    //menuMain();
    //operacionBasicas();
    EJERCICIO123();


    //RepasoJava objRJ=new RepasoJava();
    //objRJ.operacionBasicas2();

}
}