package PrincipiosJava.Clase4.Dakar.Entities;

public class Auto extends Vehiculo{
    private final static int PESO = 1000;
    private final static int RUEDAS = 4;

    public Auto(double velocidad, double aceleracion, int anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente, PESO, RUEDAS);
    }


}
