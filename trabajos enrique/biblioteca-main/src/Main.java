import entidades.Biblioteca;
import entidades.Libro;
import entidades.Usuario;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UNICORSALUD");

        separador("SISTEMA DE GESTIÓN DE BIBLIOTECA");

        registrarUsuarios(biblioteca);

        agregarLibros(biblioteca);

        biblioteca.mostrarTodosLosLibros();

        realizarPrestamos(biblioteca);

        biblioteca.mostrarLibrosDisponibles();

        separador("ESTADO DE USUARIOS");
        mostrarEstadoUsuarios(biblioteca);

        buscarLibros(biblioteca);

        realizarDevoluciones(biblioteca);

        biblioteca.mostrarLibrosDisponibles();
        separador("FIN DE LA SIMULACIÓN");
    }

    private static void registrarUsuarios(Biblioteca biblioteca) {
        separador("1. REGISTRO DE USUARIOS");
        biblioteca.registrarUsuario(new Usuario("Ana García",    "CC-001"));
        biblioteca.registrarUsuario(new Usuario("Carlos López",  "CC-002"));
        biblioteca.registrarUsuario(new Usuario("María Torres",  "CC-003"));
        // Intento de duplicado
        biblioteca.registrarUsuario(new Usuario("Ana García",    "CC-001"));
    }

    private static void agregarLibros(Biblioteca biblioteca) {
        separador("2. AGREGAR LIBROS");
        biblioteca.agregarLibro(new Libro("Cien años de soledad",    "Gabriel García Márquez", 1967, "ISBN-001"));
        biblioteca.agregarLibro(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, "ISBN-002"));
        biblioteca.agregarLibro(new Libro("1984",                    "George Orwell",          1949, "ISBN-003"));
        biblioteca.agregarLibro(new Libro("El principito",           "Antoine de Saint-Exupéry",1943,"ISBN-004"));
        biblioteca.agregarLibro(new Libro("Don Quijote de la Mancha","Miguel de Cervantes",    1605, "ISBN-005"));
        biblioteca.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "ISBN-006"));
    }

    private static void realizarPrestamos(Biblioteca biblioteca) {
        separador("3. PRÉSTAMOS");

        Usuario ana    = biblioteca.obtenerUsuarioPorId("CC-001");
        Usuario carlos = biblioteca.obtenerUsuarioPorId("CC-002");

        Libro libro1 = biblioteca.obtenerLibroPorIsbn("ISBN-001");
        Libro libro2 = biblioteca.obtenerLibroPorIsbn("ISBN-002");
        Libro libro3 = biblioteca.obtenerLibroPorIsbn("ISBN-003");
        Libro libro4 = biblioteca.obtenerLibroPorIsbn("ISBN-004");

        // Ana pide 3 libros (máximo permitido)
        ana.solicitarPrestamo(libro1);
        ana.solicitarPrestamo(libro2);
        ana.solicitarPrestamo(libro3);
        // Ana intenta pedir un 4to libro → debe ser rechazado
        ana.solicitarPrestamo(libro4);

        // Carlos intenta pedir un libro ya prestado por Ana → debe ser rechazado
        carlos.solicitarPrestamo(libro1);
        // Carlos pide un libro disponible
        carlos.solicitarPrestamo(libro4);
    }

    private static void mostrarEstadoUsuarios(Biblioteca biblioteca) {
        Usuario ana    = biblioteca.obtenerUsuarioPorId("CC-001");
        Usuario carlos = biblioteca.obtenerUsuarioPorId("CC-002");
        Usuario maria  = biblioteca.obtenerUsuarioPorId("CC-003");

        ana.mostrarLibrosPrestados();
        carlos.mostrarLibrosPrestados();
        maria.mostrarLibrosPrestados();
    }

    private static void buscarLibros(Biblioteca biblioteca) {
        separador("4. BÚSQUEDA DE LIBROS");

        // Buscar por autor
        System.out.println("  Búsqueda por autor: \"García Márquez\"");
        List<Libro> porAutor = biblioteca.buscarPorAutor("García Márquez");
        if (porAutor.isEmpty()) {
            System.out.println("  (Sin resultados)");
        } else {
            porAutor.forEach(System.out::println);
        }

        // Buscar por título
        System.out.println("\n  Búsqueda por título: \"principito\"");
        List<Libro> porTitulo = biblioteca.buscarPorTitulo("principito");
        if (porTitulo.isEmpty()) {
            System.out.println("  (Sin resultados)");
        } else {
            porTitulo.forEach(System.out::println);
        }
    }

    private static void realizarDevoluciones(Biblioteca biblioteca) {
        separador("5. DEVOLUCIONES");

        Usuario ana    = biblioteca.obtenerUsuarioPorId("CC-001");
        Usuario carlos = biblioteca.obtenerUsuarioPorId("CC-002");

        // Ana devuelve un libro
        ana.devolverLibro("ISBN-001");

        // Carlos intenta devolver un libro que no tiene → rechazado
        carlos.devolverLibro("ISBN-005");

        // Carlos devuelve su libro
        carlos.devolverLibro("ISBN-004");
    }



    private static void separador(String titulo) {
        System.out.println("\n╔══════════════════════════════════════════════════╗");
        System.out.printf( "║  %-48s║%n", titulo);
        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}