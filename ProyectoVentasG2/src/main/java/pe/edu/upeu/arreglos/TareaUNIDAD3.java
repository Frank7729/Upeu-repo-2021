package pe.edu.upeu.arreglos;

public class TareaUNIDAD3 {

    public void transformada06(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 6 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada07(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <=(dimen-1)-i; j++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 7 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);
        System.out.println("");
    }
    public void transformada13(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <=(dimen-1)-i; j++) {
                matriz[j][i]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 13 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);
        System.out.println("");
    }

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
        System.out.println("");        
    }

    public void transformada19(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                numInit++;
            }
        }
        System.out.println("--------- EJERCICIO 19 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);   
        System.out.println("");     
    }

    public void transformada22(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 22 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz); 
        System.out.println("");
    }

    public void transformada25(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 25 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);    
        System.out.println("");    
    }

    public void transformada26(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 26 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);   
        System.out.println("");   
    }

    public void transformada27(int dimen, int numInit){
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 27 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz);   
        System.out.println("");   
    }

    public void transformada28(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                    numInit++;
                }                
            } 
        }
        System.out.println("---------- EJERCICIO 28 -----------");
        TransfMat tm=new TransfMat();  
        tm.imprimirContenidoMatrizCadena(matriz); 
        System.out.println("");     
    }


    public static void main(String[] args) {
        TareaUNIDAD3 tm=new TareaUNIDAD3();
        System.out.println("**** EJERCICIOS DE MATRICES *****\n");
        tm.transformada06(5, 0);
        tm.transformada07(5, 0);
        tm.transformada13(5, 0);
        tm.transformada17(5, 0);
        tm.transformada19(5, 0);
        tm.transformada22(5, 0);
        tm.transformada25(5, 0);
        tm.transformada26(5, 0);
        tm.transformada27(5, 0);     
        tm.transformada28(5, 0);        
    }
}
