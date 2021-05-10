import java.util.Scanner;
class ejercicio05FGCM{
static Scanner teclado=new Scanner(System.in);

static void ejercicio05FGCM(){
  //Definir variables y otros
  char operadores;
  double val1=0, val2=0, resultado=0;
  //Datos de entrada
  System.out.println("Ingrese el operador aritmetico\nSuma = +\nResta = -\nDivision = /\nMultiplicacion = *\nPotencia = ^: ");
  operadores=teclado.next().charAt(0);
  System.out.println("Ingrese el 1er valor: ");
  val1=teclado.nextDouble();
  System.out.println("Ingrese el 2do valor: ");
  val2=teclado.nextDouble();
  //Proceso
  switch(operadores){
    case '+':{
      resultado=(val1+val2);
     } break;
    case '-':{
      resultado=(val1-val2);
     } break;
    case '/':{
      resultado=(val1/val2);
     } break;
    case '*':{
      resultado=(val1*val2);
     } break;
    case '^':{
      resultado=(int) Math.pow ((double)val1, (double)val2);
     } break;
  }
  //Datos de salida
  System.out.println("El resultado final es: "+resultado);
}

public static void main(String[] arg){
ejercicio05FGCM();
}
}