import java.util.Scanner;
public class Tarea789 {
    static Scanner teclado=new Scanner(System.in);

    public static void Ejercicio07(){
        System.out.println("--EJERCICIO 01--");
        //Datos de entrada
        int x,suma;
        System.out.println("N primeros numeros:");
        x=teclado.nextInt();
        //Proceso
        suma=x*(x+1)/2;
        //Datos de salida
        System.out.print("La suma es:"+suma);
    }
    public static void Ejercicio08(){
        System.out.println("--EJERCICIO 01--");
        //Datos de entrada
        int y;
        double A;
        System.out.println("El radio es:");
        y=teclado.nextInt();
        //Proceso
        A=Math.PI*y*y;
        //Datos de salida
        System.out.println("El area del circulo es:"+A);
    }
    public static void Ejercicio09(){
        System.out.println("--EJERCICIO 01--");
        //Datos de entrada
        int z;
        double q,w;
        System.out.println("Articulo X: $");z=teclado.nextInt();
        //proceso
        q=z*0.20;
        w=z-z*0.20+z*0.15;
        //Datos de salida
        System.out.println("El descuento es:"+q);
        System.out.println("Precio final es:"+w);
    }
    public static void menuMain(){
        String mensaje="Ejecutamos el siguiente algoritmo:"+
        "\n1=Ejercicio1"+
        "\n2=ejercicio2"+
        "\n3=ejercicio3"+
        "\n0=Salir del programa";
        System.out.println(mensaje);
        int opcion=0;
        do{opcion=teclado.nextInt();
        switch(opcion){
        case 1: Ejercicio07();break;
        case 2: Ejercicio08();break;
        case 3: Ejercicio09();break;
        case 4: Ejercicio07();break;
        }
        if(opcion!=0)
            System.out.println("\n Desea seguir o "+mensaje);
        }while(opcion!=0);              
    }
public static void main(String[] args){
    menuMain();
}}