package PrincipiosJava.Clase1.TM;

import java.util.Scanner;

public class Exercise3 {
    //Desarrollar un programa para informar si un número n es primo o no,
    // siendo n un valor que el usuario ingresará por consola.
    //Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
    public static void main(String[] args) {
        System.out.print("Ingrese un número para saber si es primo: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(esPrimo(number) == true){
            System.out.println("El número " + number + " es primo.");
        } else System.out.println("El número " + number + " NO es primo.");
    }

    public static boolean esPrimo(int n){
        for(int i=1; i<=n; i++){
            if(i != 1 && i != n){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
