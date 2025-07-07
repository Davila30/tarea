package ejercicio12;

public class Libro extends Publicacion implements Prestado {
    private boolean prestado;

    public Libro(String isbn, String titulo, int fechaPublicacion) {
        super(isbn, titulo, fechaPublicacion);
        this.prestado = false;
    }

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        } else {
            this.prestado = true;
        }
    }
    @Override
    public void devuelve() {
        this.prestado = false;
    }
    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
    @Override
    public String toString() {
        String estadoPrestamo = this.prestado ? "(prestado)" : "(no prestado)";
        return super.toString() + " " + estadoPrestamo;
    }
    
}
