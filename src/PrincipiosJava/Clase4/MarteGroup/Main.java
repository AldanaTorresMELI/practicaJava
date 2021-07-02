package PrincipiosJava.Clase4.MarteGroup;

import PrincipiosJava.Clase4.MarteGroup.Entities.*;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new GuestMeli("asld");
        Guest guest2 = new AverageGuest("nadie");
        Party chiquiParty = new Party("chiqui");
        chiquiParty.addGuest(guest1);
        chiquiParty.addGuest(guest2);

        FireWork fireWork1 = new FireWork("SS", "PUM!");
        FireWork fireWork2 = new FireWork("AA", "KABOM!");
        FireWork fireWork3 = new FireWork("BB", "kaboom!");

        FireWorkPackage package1 = new FireWorkPackage();

        package1.addFireWork(fireWork2);
        package1.addFireWork(fireWork3);

        chiquiParty.addFireWork(fireWork1);
        chiquiParty.addFireWork(package1);
        chiquiParty.apagar();
    }
}
