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

    public long fibonacci(int numFinal){
        long numAnt=0, numNue=1,numTem=0,contador=1;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt+numNue;
          numAnt=numTem;     
          contador++;
        }
        return numNue;
      }
      public BigInteger fibonacciBig(int numFinal){
        BigInteger numAnt=new BigInteger("0"), numNue=new BigInteger("1"),
        numTem=new BigInteger("0");
        long contador=1;
        while(contador<numFinal){
          numTem=numNue;
          numNue=numAnt.add(numNue);
          numAnt=numTem;     
          contador++;
        }
        return numNue;
    }  

    public long fibonacciRecur(int numero){
        if(numero>1){
            return fibonacciRecur(numero-1)+fibonacciRecur(numero-2);
        }
        return numero;
    }
}
