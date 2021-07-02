package PrincipiosJava.Clase2.TM.Ejercicio1;

public class CuentaCorriente {
    private String titular;
    private int cbu;
    private double saldo;
    private int numeroCuenta;

    public CuentaCorriente(String titular, int cbu, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.cbu = cbu;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this(cc.titular, cc.cbu, cc.saldo, cc.numeroCuenta);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double ingr) {
        this.saldo += ingr;
    }

    public void egreso(double egr) {
        this.saldo -= egr;
    }

    public void reintegro(double reint) {
        this.saldo += reint;
    }

    public void transferencia(double transf, CuentaCorriente cDestino) {
        this.saldo -= transf;
        cDestino.saldo += transf;
    }
}
