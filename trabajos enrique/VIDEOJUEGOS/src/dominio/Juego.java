package dominio;

public class Juego {

    private String Nombre;
    private String calidad; // UHD
    private String estilo;  // Batalla
    private String acceso;  // Offline -- Online
    private double version = 1.0;
    private static final String FABRICANTE = "Midway Games";


    public Juego() {
    }


    public Juego(String nombre, double version, String acceso, String estilo, String calidad) {
        this.Nombre = nombre;
        this.version = version;
        this.acceso = acceso;
        this.estilo = estilo;
        this.calidad = calidad;
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + Nombre + '\'' +
                ", calidad='" + calidad + '\'' +
                ", estilo='" + estilo + '\'' +
                ", acceso='" + acceso + '\'' +
                ", version=" + version +
                ", fabricante='" + FABRICANTE + '\'' +
                '}';
    }
}
