package PrincipiosJava.Clase4.SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
GuardaRopa guardaRopa = new GuardaRopa();
        Prenda prenda1 = new Prenda("Tommy", "Remera rosa");
        Prenda prenda2 = new Prenda("Adidas", "conjunto negro");
        List<Prenda> misPrendas = new ArrayList<Prenda>();
        misPrendas.add(0, prenda1);
        misPrendas.add(1, prenda2);
        guardaRopa.guardarPrendas(misPrendas);
        guardaRopa.mostrarPrendas();
        guardaRopa.devolverPrendas(1);
        guardaRopa.mostrarPrendas();

    }
}
