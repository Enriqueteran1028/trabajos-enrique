package entidades;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.disponible = true;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        System.out.println("  El libro \"" + titulo + "\" ya está prestado.");
        return false;
    }

    public void devolver() {
        disponible = true;
        System.out.println("  El libro \"" + titulo + "\" ha sido devuelto correctamente.");
    }

    @Override
    public String toString() {
        return String.format("  \"%s\" - %s (%d) | ISBN: %s | Estado: %s",
                titulo, autor, anioPublicacion, isbn,
                disponible ? "Disponible" : "Prestado");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
