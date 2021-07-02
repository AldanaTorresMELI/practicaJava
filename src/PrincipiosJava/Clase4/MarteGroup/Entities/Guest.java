package PrincipiosJava.Clase4.MarteGroup.Entities;

public abstract class Guest {
    private String name;
    private String type;

    public Guest(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eatCake();
}
