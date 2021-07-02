package PrincipiosJava.Clase4.MarteGroup.Entities;

public class FireWork implements Explode {
    private String name;
    private String noise;

    public FireWork(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    @Override
    public void explode() {
        System.out.println(noise);
    }
}
