package ejercicio12;

public class Publicacion {
    protected String isbn;
    protected String titulo;
    protected int fechaPublicacion;

    protected Publicacion(String isbn, String titulo, int fechaPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

}
