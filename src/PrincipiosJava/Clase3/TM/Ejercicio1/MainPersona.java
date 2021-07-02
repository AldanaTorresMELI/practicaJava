package PrincipiosJava.Clase3.TM.Ejercicio1;

public class MainPersona {
    public static void main(String[] args) {
        Persona pers1 = new Persona("Aldi", 234);
        Persona pers2 = new Persona("Vale", 12);
        Persona pers3 = new Persona("Gasti", 55);

        Persona arrayPersonas[] = {pers1, pers2, pers3};

        for(int i=0; i<arrayPersonas.length;i++)
        {
            System.out.print(arrayPersonas[i].getDni()+(i<arrayPersonas.length-1?",":""));

        }
        System.out.println(".");
        SortUtil.ordenar(arrayPersonas);
        System.out.println("Array ordenado");
        for(int i=0; i<arrayPersonas.length;i++)
        {
            System.out.print(arrayPersonas[i].getDni()+(i<arrayPersonas.length-1?",":""));
        }

    }
}
