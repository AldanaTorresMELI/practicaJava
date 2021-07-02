package PrincipiosJava.Clase3.TM.Ejercicio1;

public class MainCelular {

    public static void main(String[] args) {
        Celular cel1 = new Celular("Aldi", 26225555);
        Celular cel2 = new Celular("Vale", 13332);
        Celular cel3 = new Celular("Gasti", 34445);

        Celular arrayCelulares[] = {cel1, cel2, cel3};

        for (int i = 0; i < arrayCelulares.length; i++) {
            System.out.print(arrayCelulares[i].getNumero() + (i < arrayCelulares.length - 1 ? "," : ""));
        }
        System.out.println(".");
        SortUtil.ordenar(arrayCelulares);
        System.out.println("Array ordenado");
        for (int i = 0; i < arrayCelulares.length; i++) {
            System.out.print(arrayCelulares[i].getNumero() + (i < arrayCelulares.length - 1 ? "," : ""));
        }

    }
}
