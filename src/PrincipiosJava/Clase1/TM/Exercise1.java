package PrincipiosJava.Clase1.TM;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Los números pares de 0 a " + n + " son: ");
        for (int i = 0; i <= n; i++) {
            if (esPar(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esPar(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }
}
