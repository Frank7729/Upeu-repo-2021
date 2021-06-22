import java.util.Scanner;

public class Tarea1_2 {
    public static Scanner Sp=new Scanner(System.in);
    
    public static void Ejercicio01(){
        System.out.println("De: ");
        int a=Sp.nextInt(); 
        System.out.println("Hasta: ");
        int b=Sp.nextInt(); 
        int cont=0, cont1=0;
            for(int i = a; i <= b; i++){
                System.out.println("  #:"+a);a++;
                if(i%2==0){cont=cont+1;}
                if(i%2!=0){cont1=cont1+1;}
            }
        System.out.println("# par es: "+cont+"  # impar es: "+cont1);
    }
    
    public static void Ejercicio02(){
        int a,b,N,cont=0;String x=" ";
        System.out.print("De: ");
        a=Sp.nextInt(); 
        System.out.print("Hasta: ");
        b=Sp.nextInt(); 
        System.out.print("Multiplo de: ");
        N=Sp.nextInt(); 
            for(int i = a; i <= b; i++){
                System.out.print(" "+i);
                if(i%N==0){cont=cont+1;x+=(" "+i);}          
            }
        System.out.println("\nLos multiplos de "+N+" son : "+cont+++" numeros");
        System.out.println(" "+x);    
    }


    public static void main(String[] args){
        //Ejercicio01();//
        Ejercicio02();
    }
}