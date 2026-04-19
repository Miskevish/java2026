package Trabajo_Practico_Dos;

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // por defecto está disponible
    }

    // Metodo para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro fue prestado.");
        } else {
            System.out.println("El libro ya estaba prestado.");
        }
    }

    // Metodo para devolver el libro
    public void devolver() {
        disponible = true;
        System.out.println("El libro fue devuelto.");
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);

        if (disponible) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Prestado");
        }
    }
}