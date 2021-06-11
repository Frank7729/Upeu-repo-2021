import java.util.Scanner;

public class Tarea1_2_3_4 {
    static Scanner teclado=new Scanner(System.in);
    
    public static void Ejemplo01(){
        int x=0;
        String mes="";
        System.out.println("Dame un numero de un mes: ");
        x=teclado.nextInt();
        if(x==1){mes="Enero";}
        if(x==2){mes="Febrero";}
        if(x==3){mes="Marzo";}
        if(x==4){mes="Abril";}
        if(x==5){mes="Mayo";}
        if(x==6){mes="Junio";}
        if(x==7){mes="Julio";}
        if(x==8){mes="Agosto";}
        if(x==9){mes="Septiembre";}
        if(x==10){mes="Octubre";}
        if(x==11){mes="Noviembre";}
        if(x==12){mes="Diciembre";}
        else{}
        System.out.println("El mes es : "+mes);
    }
   
    public static void Ejemplo03(){
        System.out.println("El # obtenido de los 3 Dados son:");
        int x=teclado.nextInt();int y=teclado.nextInt();int z=teclado.nextInt();
        String premio="";
        if(x==6 && y==6 && z==6){premio="Oro";}
        if((x & y)==6 & z!=6 || (z & y)==6 & x!=6 || (x & z)==6 & y!=6){premio="Plata";}
        if(x==6 & y!=6 & z!=6 || y==6 & x!=6 & z!=6 || z==6 & y!=6 & x!=6 ){premio="Bronce";}
        if(x!=6 && y!=6 && z!=6){premio="Perdio";}
        System.out.println("Su puntaje es: "+premio);
    }

    public static void Ejemplo04(){
        double Monto=0;
        int HO=1;int HE=2;int MO=3;int ME=4;
        String t="";
        System.out.println("El sueldo es:");
        int x=teclado.nextInt();
        System.out.println("Para el S/T:");
        System.out.println("1.-Hombre Obrero");
        System.out.println("2.-Hombre Empleado");
        System.out.println("3.-Mujer Obrera");
        System.out.println("4.-Mujer Empleada");
        int y=teclado.nextInt();
            if(y==HO || y==ME && x>2000){Monto=x*0.15;} 
            if(y==HE && x>2000){Monto=x*0.20;}
            if(y==MO && x>2000){Monto=x*0.10;} 
            if(x<=2000){Monto=0;t="El descuento no se aplica";
        }
        System.out.println("Politica de descuento es: "+Monto+": "+t);
    }

    public static void MenuMain(){
        String mensaje="Ejecutamos el siguiente algoritmo:"+
        "\n1=Ejemplo01"+
        "\n2=Ejemplo03"+
        "\n3=Ejemplo04"+
        "\n0=Salir del programa";
        System.out.println(mensaje);
        int n=0;
        do{
        n=teclado.nextInt();
        switch (n){
            case 1: Ejemplo01(); break; 
            case 2: Ejemplo03();break;
            case 3: Ejemplo04();break;
            case 4: Ejemplo04();break;
            }
            if(n!=0)
            System.out.println("\n Desea seguir o "+mensaje);
            }while(n!=0);
        }
    public static void  main(String[] args){
        MenuMain();
  
    }}