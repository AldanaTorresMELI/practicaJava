package PrincipiosJava.Clase2.TM.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        cont1.increase();
        System.out.println(cont1.getCount());
        cont1.increase();
        System.out.println(cont1.getCount());
        cont1.decrease();
        System.out.println(cont1.getCount());

        Contador cont2 = new Contador(1);
        cont1.increase();
        System.out.println(cont1.getCount());
    }
}
