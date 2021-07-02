package PrincipiosJava.Clase1.TM;//Desarrollar un programa para mostrar por consola los primeros n números primos,
// siendo n un valor que el usuario ingresará por consola.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número para ver los números primos hasta ese número: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Los números primos hasta el "+ number +" son: ");
        for (int i = 2; i <= number; i++) {
            if(Exercise3.esPrimo(i) == true){
                System.out.print(i + " ");
            }
        }
    }
}
