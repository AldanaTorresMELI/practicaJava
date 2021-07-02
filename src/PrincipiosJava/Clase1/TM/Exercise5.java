package PrincipiosJava.Clase1.TM;
//Desarrollar un programa para mostrar por consola los primeros n números naturales
// que tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
//Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola
// los primeros 5 números naturales que tienen, al menos, 2 dígitos 3. En este caso
// la salida será: 33, 133, 233, 303, 313.

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("Cantidad de números que desea mostrar: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de número iguales que quiere mostrar: ");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();
        System.out.print("Ingrese el número que quiere que contengan los números: ");
        Scanner scanner3 = new Scanner(System.in);
        int d = scanner3.nextInt();

        int aux = 0;
        System.out.println("Los números son:");
        for (int i = 0; aux < n; i++) { //muestro los n números
            int coincidentes = 0;
            int aux2= i;
            while (aux2 != 0) {             //mientras a i le queden cifras
                int compara = aux2 % 10;
                if (compara == d) {
                    coincidentes++;
                }
                aux2 = aux2 / 10;         //le quitamos el último dígito

            }
            if (coincidentes == m) {
                aux++;
                System.out.print(i + " ");
            }
        }
    }
}
