package pe.edu.upeu.fgcm.utils;

import java.io.*;

public class LeerTeclado {
    
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
    
    public int leer(int valor, String msg) {
        System.out.print(msg);
        try {
            valor=Integer.parseInt(teclado.readLine()); 
        } catch (NumberFormatException ex) {
            System.err.print(ex.getMessage());
            valor=leer(valor, msg);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            valor=leer(valor, msg);
        }
        return valor;
    }

    public long leer(long valor, String msg) {
        System.out.print(msg);
        try {
            valor=Long.parseLong(teclado.readLine()); 
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }    

    public double leer(double valor, String msg) {
        System.out.print(msg);
        try {
            valor=Double.parseDouble(teclado.readLine()); 
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }

    public char leer(char valor, String msg) {
        System.out.print(msg);
        try {
            valor=teclado.readLine().charAt(0); //David
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }   

    public String leer(String valor, String msg) {
        System.out.print(msg);
        try {
            valor=String.valueOf(teclado.readLine()); //
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }  
    public boolean leer(boolean valor, String msg) {
        System.out.print(msg);
        try {
            valor=Boolean.parseBoolean(teclado.readLine()); //David
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }      

}