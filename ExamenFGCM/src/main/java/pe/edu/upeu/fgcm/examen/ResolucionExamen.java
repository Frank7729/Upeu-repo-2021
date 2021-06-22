package pe.edu.upeu.fgcm.examen;

import pe.edu.upeu.fgcm.utils.LeerTeclado;

public class ResolucionExamen{
    static LeerTeclado tc=new LeerTeclado();
 
    public void Ejercicio02(){
    double im=0,im1=0,im2=0,imp=0,imp1=0,imp2=0;
    int catg=0,catg1=0,catg2=0,s=0,s1=0,s2=0;
    System.out.println("\n            EJERCICIO  02");
    for(int i=1 ; i<4 ; i++){
        System.out.println("\nCategoria:"+i);
        int r=tc.leer(0,"      Cantidad de Autos : "); 
        int y=tc.leer(0,"      CostoUnit : ");
        if(i==1 & y>0 & r>0){im=y*0.12;imp=y*0.12*r;catg=i;s=r;}
        if(i==2 & y>0 & r>0){im1=y*0.08;imp1=y*0.08*r;catg1=i;s1=r;}
        if(i==3 & y>0 & r>0){im2=y*0.05;imp2=y*0.05*r;catg2=i;s2=r;}
    }
    //Datos de Salida
    System.out.println("\n---- Registro de Ventas Automotriz ----");
    System.out.println("  Cntd"+"  Categ"+"   ImpuUnit"+"   ImpuCntd");
    System.out.println("   "+s+"      "+catg+"      "+im+"    $ "+imp);
    System.out.println("   "+s1+"      "+catg1+"      "+im1+"    $ "+imp1);
    System.out.println("   "+s2+"      "+catg2+"      "+im2+"    $ "+imp2);
    System.out.println("\n                ImpTotal   $ "+(imp+imp1+imp2));
    }         

    public void Ejercicio03(){
    System.out.println("\n            EJERCICIO  03");
    System.out.println("Tabla de Multiplicar del 1 al 20 : ");
    for(int y=0; y<20; y++){
        int a=y+1;
        for(int x=0; x<10; x++){
            int b=x+1;
            System.out.println(a+" X " +b+ " = " + a*b);
        }
    System.out.println("");
    }
    } 

    public void Ejercicio04(){
        System.out.println("\n            EJERCICIO  04");
        int t,a=0,b=0,c=0,i=1;
        a=tc.leer(0,"Números perfectos entre 1 hasta ");
        b=tc.leer(0,"Los N primeros numeros son: ");
        while(i<=a){i++;
            t = 0;
            for(int x=1; x<i; x++){                          
                if(i%x==0){t=t+x;}
            }
            if(i==t){c=c+1;
                if(c<=b){
                System.out.println("- "+i);
                }
            }
        }
    }
    
    public void Ejercicio05(){
    System.out.println("\n            EJERCICIO  05");
    int a = tc.leer(0,"La base: ");
    int b = tc.leer(0,"El exponente: ");
    System.out.println(""+a+" elevado a la "+b+" es = "+potencia(a, b));
    }
 
        double potencia(int a, int b){
        if(b==0){
            return 1;}
        else if(b==1){
            return a;
        } 
        else if (b<0) {
            return potencia(a, b+1) / a;} 
        else {
            return a * potencia(a, b-1);
        }
    }
    
    public void menuMain(){
        String mensaje="Ejecutamos el siguiente algoritmo:"+
        "\n1=Ejercicio02"+
        "\n2=Ejercicio03"+
        "\n3=ejercicio04"+
        "\n4=ejercicio05"+
        "\n0=Salir del programa";
        System.out.println(mensaje);
        int opcion=0;
        do{
        opcion=tc.leer(0,"Algoritmo: ");
        switch(opcion){
        case 1: Ejercicio02();break;
        case 2: Ejercicio03();break;
        case 3: Ejercicio04();break;
        case 4: Ejercicio05();break;
        case 5: Ejercicio05();break;
        }
        if(opcion!=0)
            System.out.println("\n Desea seguir o "+mensaje);
        }while(opcion!=0);              
    }  

}
