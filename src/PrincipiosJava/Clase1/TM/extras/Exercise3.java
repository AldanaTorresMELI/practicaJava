package PrincipiosJava.Clase1.TM.extras;

import java.util.Scanner;

//Haz una aplicación que calcule el área de un círculo(pi*R2).
// El radio se pedirá por teclado (recuerda pasar de String
// a double conDouble.parseDouble). Usa la constante PI y el método pow de Math.
public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Ingrese el radio del círculo: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);

    }
}
