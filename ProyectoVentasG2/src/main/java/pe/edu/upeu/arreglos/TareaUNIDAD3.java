package pe.edu.upeu.arreglos;

public class TareaUNIDAD3 {

    public void transformada17(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[j][(dimen-1)-i]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 17 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada18(int dimen, int numInit) {
        int item=0;
        String[][] matriz=new String[dimen][dimen];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (fila<dimen-colum) {
                    if ((fila+colum)%2==0) {
                        item=numInit+(fila+colum)*(fila+colum+1)/2 + colum;
                        matriz[colum][fila]=""+item;
                    }else{
                        item=numInit+(fila+colum)*(fila+colum+1)/2 + fila;
                        matriz[colum][fila]=""+item;
                    }
                } else {
                    matriz[colum][fila]="";
                }         
            }        
        }
        System.out.println("---------- EJERCICIO 18 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);
    }
    
    public void transformada22(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 22 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada23(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 23 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada24(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 24 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada25(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 25 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada28(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 28 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada29(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 29 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }
    
    public void transformada35(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 35 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public void transformada36(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 36 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }



    public static void main(String[] args) {
        TareaUNIDAD3 tm=new TareaUNIDAD3();

        tm.transformada17(5, 0);
        System.out.println("");
        tm.transformada18(5, 0);
        System.out.println("");
    }
}
