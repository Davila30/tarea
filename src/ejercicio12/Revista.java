package ejercicio12;

public class Revista extends Publicacion {
    private int numero;


    public Revista(String isbn, String titulo, int añoPublicacion, int numero) {
        super(isbn, titulo, añoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return super.toString() + " (Revista) " + this.numero;
    }
    
}
