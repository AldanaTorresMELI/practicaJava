package PrincipiosJava.Clase4.MarteGroup.Entities;

public class GuestMeli extends Guest{

    public GuestMeli(String name) {
        super(name, "Meli");
    }

    @Override
    public void eatCake(){
        System.out.println("Viva la Chiqui!!");
    }
}
