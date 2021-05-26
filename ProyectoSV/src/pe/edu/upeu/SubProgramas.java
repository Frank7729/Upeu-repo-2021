package pe.edu.upeu;

import java.util.Scanner;

public class SubProgramas {
    
    
public int factorial(int numero) {
    int resultF=1;
    if(numero>1){
        for(int i=1; i<=numero;i++) {
            resultF*=i;
        }
    }
    return resultF;
}
public int potencia(int numero) {
    return 0;
}
public void funcionExponencial() {
    System.out.println("Factorial:"+factorial(5));
}


Scanner objSp=new Scanner(System.in);
    public double suma(double num1, double num2) {
        double resultado=num1+num2;    
        return resultado;
    }
    public double resta(double num1, double num2) {
        double resultado=num1-num2;    
        return resultado;
    } 
    public double division(double num1, double num2) {
        double resultado=num1/num2;    
        return resultado;
    }
    public double potencia(double num1, double num2) {
        double resultado=Math.pow(num1, num2);    
        return resultado;
    } 
    public double multiplicacion(double num1, double num2) {
        double resultado=num1*num2;    
        return resultado;
    }

    public void operacionesBasicas() {
        System.out.println("Ingrese el primer valor:");
        double num1=objSp.nextDouble();
        System.out.println("Ingrese el segundo valor:");
        double num2=objSp.nextDouble();
        System.out.println("Indique la Operacion que desee realizar(Suma=+, resta=-,"+ 
        "division=/, multiplicacion=*, potencia=^):");
        char operador=objSp.next().charAt(0);
        double resultado=0;
        switch (operador) {
            case '+': resultado=suma(num1, num2); break;
            case '-': resultado=resta(num1, num2); break;
            case '/': resultado=division(num1, num2); break;
            case '*': resultado=multiplicacion(num1, num2); break;
            case '^': resultado=potencia(num1, num2); break;        
            default: break;
        }
        System.out.println("El resultado de la operacion "+operador+" es:"+resultado);
    }
}

