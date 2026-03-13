package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String numeroIdentificacion;
    private List<Libro> librosPrestados;
    private static final int MAX_LIBROS = 3;

    public Usuario(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.librosPrestados = new ArrayList<>();
    }

    public boolean solicitarPrestamo(Libro libro) {
        if (librosPrestados.size() >= MAX_LIBROS) {
            System.out.println(" " + nombre + " ya tiene el máximo de " + MAX_LIBROS + " libros prestados.");
            return false;
        }

        if (libro.prestar()) {
            librosPrestados.add(libro);
            System.out.println("  Préstamo exitoso: \"" + libro.getTitulo() + "\" → " + nombre);
            return true;
        }
        return false;
    }

    public boolean devolverLibro(String isbn) {
        for (Libro libro : librosPrestados) {
            if (libro.getIsbn().equals(isbn)) {
                libro.devolver();
                librosPrestados.remove(libro);
                return true;
            }
        }
        System.out.println("  " + nombre + " no tiene prestado un libro con ISBN: " + isbn);
        return false;
    }

    public void mostrarLibrosPrestados() {
        System.out.println(" " + nombre + " (" + numeroIdentificacion + ") - Libros prestados: " + librosPrestados.size() + "/" + MAX_LIBROS);
        if (librosPrestados.isEmpty()) {
            System.out.println("     (ninguno)");
        } else {
            for (Libro libro : librosPrestados) {
                System.out.println("     - \"" + libro.getTitulo() + "\" [" + libro.getIsbn() + "]");
            }
        }
    }

    @Override
    public String toString() {
        return " " + nombre + " | ID: " + numeroIdentificacion + " | Libros prestados: " + librosPrestados.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
