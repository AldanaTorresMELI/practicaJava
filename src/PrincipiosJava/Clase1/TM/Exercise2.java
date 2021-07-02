package PrincipiosJava.Clase1.TM;

import java.util.Scanner;

//Desarrollar un programa para mostrar los primeros n múltiplos de m,
// siendo n y m valores que el usuario ingresará por consola.
//Recordá que un número a es múltiplo de b si a es divisible por b.

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Ingrese el número del cual quiere saber múltiplos: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de múltiplos que quiere saber: ");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();
        System.out.println("Los múltiplos son:");
        int acum = 0;
        for (int i = 1; (acum < m); i++) {
            if (n % i == 0) {
                acum++;
                if (i == n) {
                    acum = m;
                }
                System.out.print(i + " ");
            }
        }

    }
}