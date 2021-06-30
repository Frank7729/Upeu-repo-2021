package pe.edu.upeu.arreglos;

public class TransfMat {
    
    public void transformada01(int dimension, int valorInicial) {
        int item=0;
        int[][] matriz=new int[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[fila][colum]=item;
                }
            }
        }        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<matriz.length-i){
                System.out.print(matriz[i][j]+"\t");
                }else{
                System.out.print("\t");
                }
            }
            System.out.println("");
        }          
    }

    public void transformada01x(int dimension, int valorInicial) {
        int item=0;
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[fila][colum]=""+item;
                }else{
                    matriz[fila][colum]="";
                }
            }
        }  
        imprimirContenidoMatrizEnteros(matriz);              
    }    
    
    public void imprimirContenidoMatrizEnteros(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    } 


    public void imprimirContenidoMatrizEnteros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    }
     
    public void Ejercicio02(int dimension, int valorInicial) {
        int item=0;
        int[][] matriz=new int[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[colum][fila]=item;
                }
            }
        }        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<matriz.length-i){
                System.out.print(matriz[i][j]+"\t");
                }else{
                System.out.print("\t");
                }
            }
            System.out.println("");
        }          
    }
    
    public void Ejercicio03(int dimension, int valorInicial) {
        int item=0;
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    if ((fila+colum)%2==0) {
                        item=valorInicial+(fila+colum)*(fila+colum+1)/2 + colum;
                        matriz[fila][colum]=""+item;
                    }else{
                        item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila;
                        matriz[fila][colum]=""+item;
                    }
                } else {
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidoMatrizEnteros(matriz);
        System.out.println("");
    }
     
    public void Ejercicio04(int dimension, int valorInicial) {
        int item=0;
        String matriz [][] = new String [dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    if ((fila+colum)%2==0) {
                        item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila;
                        matriz[fila][colum]=""+item;
                    }else{
                        item=valorInicial+(fila+colum)*(fila+colum+1)/2 + colum;
                        matriz[fila][colum]=""+item;
                    }
                } else {
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidoMatrizEnteros(matriz);
        System.out.println("");
    }
    
    public static void main(String[] args) {    
        TransfMat tm=new TransfMat();  
        tm.transformada01(5,0);  
        //System.out.println("");
        //tm.transformada01x(5,0);    
        tm.Ejercicio02(5,0);
        tm.Ejercicio03(5,0);
        tm.Ejercicio04(5,0);
    }

}