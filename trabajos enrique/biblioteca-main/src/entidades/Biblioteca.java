package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una Biblioteca.
 * Permite registrar usuarios, agregar libros
 * y realizar búsquedas dentro del catálogo.
 */
public class Biblioteca {

    // ===== ATRIBUTOS =====
    private String nombre;
    private List<Libro> coleccionLibros;
    private List<Usuario> usuariosRegistrados;

    // ===== CONSTRUCTOR =====
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.coleccionLibros = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    // ===== REGISTRO DE USUARIOS =====
    public void registrarUsuario(Usuario usuario) {

        // Verifica si el usuario ya está registrado
        for (Usuario u : usuariosRegistrados) {
            if (u.getNumeroIdentificacion().equals(usuario.getNumeroIdentificacion())) {
                System.out.println("Usuario con ID " + usuario.getNumeroIdentificacion() + " ya está registrado.");
                return;
            }
        }

        usuariosRegistrados.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre() +
                " (ID: " + usuario.getNumeroIdentificacion() + ")");
    }

    // ===== AGREGAR LIBROS =====
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
        System.out.println("Libro agregado: \"" + libro.getTitulo() +
                "\" de " + libro.getAutor());
    }

    // ===== BUSCAR LIBROS POR TITULO =====
    public List<Libro> buscarPorTitulo(String titulo) {

        List<Libro> resultados = new ArrayList<>();

        for (Libro libro : coleccionLibros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(libro);
            }
        }

        return resultados;
    }

    // ===== BUSCAR LIBROS POR AUTOR =====
    public List<Libro> buscarPorAutor(String autor) {

        List<Libro> resultados = new ArrayList<>();

        for (Libro libro : coleccionLibros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultados.add(libro);
            }
        }

        return resultados;
    }

    // ===== MOSTRAR LIBROS DISPONIBLES =====
    public void mostrarLibrosDisponibles() {

        System.out.println("\nLibros disponibles en " + nombre + ":");

        boolean hayDisponibles = false;

        for (Libro libro : coleccionLibros) {
            if (libro.isDisponible()) {
                System.out.println(libro);
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("(No hay libros disponibles en este momento)");
        }
    }

    // ===== MOSTRAR TODOS LOS LIBROS =====
    public void mostrarTodosLosLibros() {

        System.out.println("\nCatálogo completo de " + nombre + ":");

        for (Libro libro : coleccionLibros) {
            System.out.println(libro);
        }
    }

    // ===== MOSTRAR USUARIOS =====
    public void mostrarUsuarios() {

        System.out.println("\nUsuarios registrados en " + nombre + ":");

        for (Usuario usuario : usuariosRegistrados) {
            System.out.println(usuario);
        }
    }

    // ===== BUSCAR LIBRO POR ISBN =====
    public Libro obtenerLibroPorIsbn(String isbn) {

        for (Libro libro : coleccionLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }

        return null;
    }

    // ===== BUSCAR USUARIO POR ID =====
    public Usuario obtenerUsuarioPorId(String id) {

        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNumeroIdentificacion().equals(id)) {
                return usuario;
            }
        }

        return null;
    }

    // ===== GETTERS Y SETTERS =====
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
}
