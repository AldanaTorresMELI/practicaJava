package PrincipiosJava.Clase3.TM.Ejercicio1;

public class Celular implements IPrecedable<Celular> {
    private String titular;
    private int numero;

    public Celular(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean precedeA(Celular t) {
        boolean aux = false;
        if (this.numero < t.numero)
            aux = true;
        return aux;
    }
}
