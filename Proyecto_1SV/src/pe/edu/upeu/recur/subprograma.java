package pe.edu.upeu.recur;

import java.math.BigInteger;

public class subprograma {
    public long factorial(int numero) { 
        long resultF=1;
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF*=i;
            }
        }   
        return resultF;
    }
    public BigInteger factorialBig(int numero) { 
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                resultF=resultF.multiply(new BigInteger(String.valueOf(i)));
            }
        }   
        return resultF;
    }    

    public BigInteger factorialRecurvBig(int numero) {
        BigInteger resultF=new BigInteger("1");
        if(numero>1){
            return factorialRecurvBig(numero-1).multiply(new BigInteger(String.valueOf(numero)));          
        } else{
            return resultF; 
        }                        
    }
    
}
