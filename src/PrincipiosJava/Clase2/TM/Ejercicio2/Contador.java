package PrincipiosJava.Clase2.TM.Ejercicio2;

public class Contador {
    private int count;

    public Contador() {
        this(0);
    }

    public Contador(Contador c) {
        this(c.count);
    }

    public Contador(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        this.count--;
    }
}
