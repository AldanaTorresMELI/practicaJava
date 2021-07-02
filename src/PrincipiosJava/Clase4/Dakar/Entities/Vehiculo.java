package PrincipiosJava.Clase4.Dakar.Entities;

public class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private int anguloGiro;
    private String patente;
    private int peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, int anguloGiro, String patente, int peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloGiro = anguloGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(int anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public double isWinner(){
        return velocidad * (1/2 * aceleracion / (anguloGiro * (peso - ruedas *100)));
    }

    @Override
    public String toString(){
        System.out.println("--------------------------");
        return "Vehiculo{" + "velocidad:" + velocidad +
                ", aceleración: " + aceleracion +
                ", ángulo de giro: " + anguloGiro +
                ", patente: " + patente +
                ", peso: " + peso +
                ", ruedas: " + ruedas +
                "}";
    }
}
