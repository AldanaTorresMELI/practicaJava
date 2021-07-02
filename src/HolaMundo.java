import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        int a =1;
        int b=10;
        Scanner c= new Scanner(System.in);
        String entradaTeclado = c.nextLine ();
        int r= a+b;
        System.out.println("El resulltado es: " + r);
        System.out.println("Tu numero es: "+ entradaTeclado);
    }
}
