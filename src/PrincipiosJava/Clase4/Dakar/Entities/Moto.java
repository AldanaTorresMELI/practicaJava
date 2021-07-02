package PrincipiosJava.Clase4.Dakar.Entities;

public class Moto extends Vehiculo{

    private final static int PESO = 300;
    private final static int RUEDAS = 2;

    public Moto(double velocidad, double aceleracion, int anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente, PESO, RUEDAS);
    }

}
