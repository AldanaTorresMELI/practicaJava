package PrincipiosJava.Clase3.TM.Ejercicio1;

public class Persona implements IPrecedable<Persona>{
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    //por DNI menor
    @Override
    public boolean precedeA(Persona t) {
        boolean aux = false;
        if(this.dni < t.dni){
            aux = true;
        }

        return aux;
    }
}
