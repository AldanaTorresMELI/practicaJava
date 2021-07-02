package PrincipiosJava.Clase2.TM.Ejercicio3;

public class Libro {
    private String autor;
    private String titulo;
    private int isbn;
    private String descripcion;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String autor, String titulo, int isbn, String descripcion, boolean prestado) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.descripcion = descripcion;
        this.prestado = prestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void prestamo(){
        if(this.prestado == true){
            System.out.println("El libro no esta disponible!");
        }
        this.prestado = true;
    }

    public void devolucion(){
        this.prestado = false;
    }

    @Override
    public String toString(){
        return descripcion;
    }
}
