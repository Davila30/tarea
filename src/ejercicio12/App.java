package ejercicio12;

public class App {
    public static void main(String[] args) {
    // Crear instancias de Libro
    Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
    Libro libro2 = new Libro("112233", "Los Otros", 2016);
    Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
    // Crear instancias de Revista
    Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
    Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
    // Imprimir detalles de las publicaciones
    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);
    System.out.println(revista1);
    System.out.println(revista2);
    // Prestar y devolver libros
    libro2.presta();
    // Verificar si el libro está prestado
    if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
    }
    // Devolver el libro
    libro2.presta();
    libro2.devuelve();
    // Verificar nuevamente si el libro está prestado
    if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
    }
    // Prestar otro libro
    libro3.presta();
    // Imprimir nuevamente los detalles de los libros
    System.out.println(libro2);
    System.out.println(libro3);
    }
}
