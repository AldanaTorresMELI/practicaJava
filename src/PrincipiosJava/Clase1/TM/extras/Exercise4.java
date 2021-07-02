package PrincipiosJava.Clase1.TM.extras;

import java.util.Scanner;

//Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
// Si no lo es, también debemos indicarlo.
public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Ingrese el número que quiere probar:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%2 == 0){
            System.out.println("El número: " + number + " es divisible entre 2.");
        } else System.out.println("El número: " + number + " NO es divisible entre 2.");
    }

}
