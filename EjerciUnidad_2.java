import java.util.Scanner;


public class EjerciUnidad_2 {
    static Scanner teclado=new Scanner(System.in);
    static int a=1500*12;
    static double b=0.10;
    static short c=6;
    static double d=(1500*12)*b;

    public static void Ejercicio1(){
        //Definir variables y otros
        System.out.println("--EJERCICIO4.1--");
        //Datos de salida
        System.out.println("¿Su salario por cada año es?:"+(a+d));
        System.out.println("¿Su salario x6años mas su incremento?:"+(d*c+a*c));
    }

    public static void Ejercicio2(){
        //Definir variables y otros
        System.out.println("--EJERCICIO4.2--");
        int y,x,pago;
        String Tipo="";
        //Datos de Entrada
        System.out.println("Cantidad de amburguesas:");
        x=teclado.nextInt();
        System.out.println("Costo:");
        y=teclado.nextInt();
        System.out.print("Ingrese el tipo de pago\n\t1=Efectivo\n\t2=Tarjeta de Credito : ");
        pago=teclado.nextInt();
        double montoP;
        montoP=0;
        //Proceso
        if(pago==1){
            montoP=x*y;
        }else if(pago==2){
            montoP=(x*y)+x*y*0.05;
        }if(y==20){
            Tipo=("Sencillas");
        }if(y==25){
            Tipo=("Dobles");
        }if(y==28){
            Tipo=("Triples");
        }
        //Datos de salida
        System.out.println("Hamburguezas Tipo:"+Tipo+" El monto pagar es:"+montoP);   
    }
    
    public static void Ejercicio3(){
        System.out.println("--EJERCICIO4.3--");
        //Definir variables y otros
        int n=0, q=0, w=0, e=0, numero;
        //Datos de Entrada y Proceso
        System.out.println("Cuantos numeros desea ingresar:");
        numero=teclado.nextInt();
        for(int x=1; x<=numero; x++){
        System.out.print("El numero es:");
        n=teclado.nextInt();
        if (n==0) {
        q=q+ 1;
        }if (n>0) {
        w=w+ 1;
        }if (n<0) {
        e=e+ 1;
        }}
        //Datos de salida
        System.out.println("Numeros que son 0 es:"+q);
        System.out.println("Numeros que son mayores a 0 es:"+w);
        System.out.println("Numeros que son menores a 0 es:"+e);
    
    } 
   
    public static void Ejercicio4(){
        //Definir variables y otros
        System.out.println("--z EJERCICIO 4.4 <--");
        int color, Fblancos, Frojos, Fverdes, i, n;
        Fverdes = 0;
        Fblancos = 0;
        Frojos = 0;
        System.out.print("Cantidad N focos:");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("DESARROLLO ");
            System.out.println(" Selecciona el color.");
            System.out.println("1.- verde");
            System.out.println("2.- blanco");
            System.out.println("3.- rojo");
            System.out.print(": ");
            do {
                color = teclado.nextInt();
                teclado.nextLine();
                if (color<1||color>3)
                    System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
            } while (color<1||color>3);
            if(color==1)
                Fverdes=Fverdes+1;
            if(color==2)
                Fblancos=Fblancos+1;
            if(color==3)
                Frojos=Frojos+1;
        }
        //Datos de salida
        System.out.println("Al contabilizar tenemos:");
        System.out.println(-Fverdes+ " Focos verdes");
        System.out.println(-Fblancos+ " Focos verdes");
        System.out.println(-Frojos+ " Focos verdes");
    }

    public static void Ejercicio5(){
        //Definir variables y otros
        System.out.println("--EJERCICIO4.5");
        long x=3;
        double ahorro=0;
        for (x=1; x<=365; x++) {
            ahorro=ahorro+Math.pow(3, x);
            System.out.println("El ahorro en el dia "+x+" es: $"+Math.pow(3, x));
        }
        System.out.println("El ahorro en un año es: $"+ahorro);
    }

    public static void Ejercicios6(){
        //Definir variables y otros
        System.out.println("--EJERCICIO4.6--");
        System.out.println(" CICLO REPITE ");
        //Datos de salida
        int i,s;
        System.out.println("Digite la cantidad de terminos: ");
        s=teclado.nextInt();
        for(i=0; i<=s; i++){
            System.out.println(" "+i+1);
        System.out.println("¿Su salario por cada año es?:"+(a+d));
        System.out.println("¿Su salario x6años mas su incremento?:"+(d*c+a*c));
    }
    }

    public static void Ejercicios7(){
        //Definir variables y otros
        System.out.println("--EJERCICIO4.6.1--");
        System.out.println(" CICLO DESDE ");
        //Datos de salida
        int i,n,f;
        System.out.println("Ingrese valor incial:");
            n=teclado.nextInt();
        System.out.println("Ingrese valor final:");
            f=teclado.nextInt();
        for(i=n; i<=f; i++){
            System.out.println(" "+i);
        System.out.println("¿Su salario por cada año es?:"+(a+d));
        System.out.println("¿Su salario x6años mas su incremento?:"+(d*c+a*c));
    }
    }

    public static void Ejercicios8(){
        //Definir variables y otros
        int x,y,i;
        double montoz;
        double dinero=0;
        System.out.println("--EJERCICIO4.8--");
        System.out.println(" N articulos:");
        x=teclado.nextInt();
        for (i=1; i<=x; i++){ 
            System.out.println("Articulo "+i);
            System.out.println("Precio:");
            y=teclado.nextInt();
        if(y<=100){
            montoz=y*0.10*x;
            dinero=y*x-y*0.10*x;
        }else if(x>100 && x<200){
            montoz=y*0.12*x;
            dinero=y*x-y*0.12*x;
        }else{
            montoz=y*0.15*x;
            dinero=y*x-y*0.15*x;
        }
        //Datos de salida
        System.out.println("El costo es:"+dinero+" El descuento es:"+montoz);}
    }

    public static void Ejercicio9(){
        System.out.println("--EJERCICIO4.9--");
        int x;
        int b;
        double montox=0;
        System.out.println("X Cantidad de pesos/mes:");
        x=teclado.nextInt();
        System.out.println("N años:");
        b=teclado.nextInt();
        if(x>0){
            montox=b*x*0.10*12+x*b*12;
        }
        System.out.println("Inversion Final es:"+montox);
    }

    public static void Ejercicio10(){ 
        System.out.println("--EJERCICIO4.22--") ;
        int i,n;
        double monto, Ganintereses, intereses, multa, pago;
        double Pminimo, PPNGintereses, Sactual, Santerior;
        Ganintereses = 0;
        System.out.print("N clientes: ");
        n = teclado.nextInt();
        for (i=1; i<=n; i++) {
        System.out.print("Cliente "+ i);
        System.out.print(" Ingresa el valor de saldo anterior: ");
        Santerior = teclado.nextDouble();
        System.out.print("Ingresa el valor de compras realizadas: ");
        monto = teclado.nextDouble();
        System.out.print("Ingresa el valor de pago del corte anterior: ");
        pago = teclado.nextDouble();
        teclado.nextLine();
        if(Santerior*0.15>pago){
            intereses=Santerior*0.12;
            multa=200;
        }else{
            intereses=0;
            multa=0;
        }
            Sactual=Santerior+monto-pago+intereses+multa;Pminimo=Sactual*0.15;
            PPNGintereses=Sactual*0.85;Ganintereses=Ganintereses+intereses;
        System.out.println("Valor de intereses: $"+intereses);
        System.out.println("Valor de multa: $"+multa);
        System.out.println("--Pago minimo es: $"+Pminimo);
        System.out.println("--Pago para no generar intereses es: $"+PPNGintereses);
        System.out.println("--Saldo actual es: $"+Sactual);
        }
    }

    public static void Ejercicio11(){
        System.out.println("--EJERCICIO4.17--");
        int i,n,x;
        System.out.println("Tabla de multiplicar :");
        n=teclado.nextInt();
        System.out.println("Hasta :");
        x=teclado.nextInt();
        for (i=1;i<=x; i++) 
            System.out.println(":"+n+" x "+i+" ="+n*i);
        }

    public static void menuMain(){
        String mensaje="Ejecutamos el siguiente algoritmo:"+
        "\n1=Ejercicio1"+
        "\n2=ejercicio2"+
        "\n3=ejercicio3"+
        "\n4=Ejercicio4"+
        "\n5=Ejercicio5"+
        "\n6=Ejercicio6"+
        "\n7=Ejercicios7"+
        "\n8=Ejercicios8"+
        "\n9=Ejercicios9"+
        "\n10=Ejercicio10"+
        "\n11=Ejercicio11"+
        "\n0=Salir del programa";
        System.out.println(mensaje);
        int opcion=0;
        do{
        opcion=teclado.nextInt();
        switch(opcion){
        case 1: Ejercicio1();break;
        case 2: Ejercicio2();break;
        case 3: Ejercicio3();break;
        case 4: Ejercicio4();break;
        case 5: Ejercicio5();break;
        case 6: Ejercicios6();break;
        case 7: Ejercicios7();break;
        case 8: Ejercicios8();break;
        case 9: Ejercicio9();break;
        case 10: Ejercicio10();break;
        case 11: Ejercicio11();break;
        case 12: Ejercicio11();break;
        }
        if(opcion!=0)
            System.out.println("\n Desea seguir o "+mensaje);
        }while(opcion!=0);              
    }    
    
    public static void main(String[] args){
    menuMain();
}
}