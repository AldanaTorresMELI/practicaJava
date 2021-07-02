package PrincipiosJava.Clase1.TM.extras;
//Declara dos variables numéricas (con el valor que desees),
// muestra por consola la suma, resta, multiplicación, división y
// módulo (resto de la división).
public class Exercise1 {
    public static void main(String[] args) {
        double a = 525;
        double b = 33;
double sum = a+b;
double rest = a-b;
double mult = a * b;
double div = a / b;
double mod = a % b;

        System.out.println("La suma de "+ a+" y " + b + " es: "+ sum);
        System.out.println("La resta de "+ a+" y " + b + " es: "+ rest);
        System.out.println("La multiplicación de "+ a+" y " + b + " es: "+ mult);
        System.out.println("La división de "+ a+" y " + b + " es: "+ div);
        System.out.println("El módulo de "+ a+" y " + b + " es: "+ mod);
    }
}
