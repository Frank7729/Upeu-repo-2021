import java.util.Scanner;

public class Tarea1234 {
    static Scanner teclado=new Scanner(System.in);
    
    public static void Ejercicio01() {
        System.out.println("INGRESE SUS 3 NOTAS:");
        System.out.println("NOTA 1: "); int x=teclado.nextInt();
        System.out.println("NOTA 2: "); int y=teclado.nextInt();
        System.out.println("NOTA 3: "); int z=teclado.nextInt();
        String num1="";
        double a=(x+y+z)/3;
        if(a<13) {
            num1="Desaprobado";
        }else{
            num1="Aprobado";
        }
        System.out.println("El Promedio es: "+a+" El alumno a: "+num1);
    }
    public static void Ejercicio02() {
        System.out.println("Dame 3 numeros: ");
        System.out.println("# 1: "); int x=teclado.nextInt();
        System.out.println("# 2: "); int y=teclado.nextInt();
        System.out.println("# 3: "); int z=teclado.nextInt();
        int valor=0;
        if(x>y && x>z){
            valor=x;}
        if(y>x && y>z){
            valor=y;}
        if(z>x && z>y){
            valor=z;
        }
        System.out.println("El numero mayor es : "+valor);
    }
    public static void Ejercicio03() {
        System.out.println("Asignacion de Becas:");
        System.out.println("Edad: ");
        int edad=teclado.nextInt();
        System.out.println("Promedio: ");
        int promedio=teclado.nextInt();
        String r="";
        if(edad>18 && promedio<13){
            r="Estudia Mas";}
        if(edad>18 && promedio>=13 && promedio<16){
            r="500";}
        if(edad>18 && promedio>=16 && promedio<18){
            r="1000";}
        else if(edad>18 && promedio>=18){
            r="2000";}
        if(edad<=18 && promedio<13){
            r="Estudia Mas";}
        if(edad<=18 && promedio>=13 && promedio<16){
            r="100";}
        if(edad<=18 && promedio>=16 && promedio<18){
            r="2000";}
        else if(edad<=18 && promedio>=18){
            r="3000";}
        System.out.println("La beca es: "+r);
    }
    public static void Ejercicio04(){
        System.out.println("Dado las 3 longitudes: ");
        int a=teclado.nextInt();
        int b=teclado.nextInt();
        int c=teclado.nextInt();
        String w="";
        if(a<(b+c) && b<(a+c) && c<(a+b)){
            w="Es un Triangulo";}
        else{
            w="No es un triangulo";}
        if(a==b && b==c){
            w="T.Equilatero";}
        else if(a!=b && b!=c && a!=c){
            w="T.Escaleno";}
        else{
            w="T.Isosceles";
        }
        System.out.println("Es un: "+w);
}
public static void main(String[] args){
    //Ejercicio01();
    //Ejercicio02();
    //Ejercicio03();
    Ejercicio04();
}}

