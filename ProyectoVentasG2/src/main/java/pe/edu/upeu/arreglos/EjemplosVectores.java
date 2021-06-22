package pe.edu.upeu.arreglos;

public class EjemplosVectores {
    
    public static void ejemplosVectores(){
        int[] v1={1,2,3,4,5,6,7,8,9,10};
        System.out.println("v1[7]= "+v1[9]);
        
        int[] v2=new int[2];
                v2[0]=20;
                v2[1]=2;
        System.out.println("Tmaño del vector v2= "+v2.length);
        System.out.println("Tmaño del vector v1= "+v1.length);
    }

    public static void sumaVectoresPares(int[] v1){
        int sumaV=0;
        for(int i=0; i<v1.length; i++){
            if(v1[i]%2==0){
                sumaV+=v1[i];
            }
        }
        System.out.println("Suma de #s pares = "+sumaV);
    }

    public static void almacenarValoresenVector(){
        
    }

    public static void Ejenplo01(){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Tabla de Multiplicar: ");
        for(int i=0; i<=a.length; i++){
                for(int x=0; x<b.length; x++){
                    System.out.println(a[i]+"x"+b[x]+"= "+a[i]*b[x]);
                }
                System.out.println("");
            }
    }

    public static void Ejemplo01_1(){
        int[] a=new int[10], b=new int[10];
        for(int i=0; i<10; i++){
            a[i]=i+1;       
            for(int x=0; x<10; x++){
                b[x]=x+1;
                System.out.println(a[i]+"x"+b[x]+"= "+a[i]*b[x]);
            }
            System.out.println("");
        }
    }

    
    public static void main(String[] args){
        //ejemplosVectores();
        //int[] v1={1,2,3,4,5,6,7,8,9,10};
        //sumaVectoresPares(v1);
        //Ejenplo01();
        Ejemplo01_1();
    }
}
