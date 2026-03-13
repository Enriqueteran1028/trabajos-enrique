package dominio;

public class Dificultad {

    private String nivel;        // Fácil, Medio, Difícil
    private String descripcion;  // Texto explicativo
    private int enemigosExtra;   // Número de enemigos adicionales
    private double velocidadJuego; // Modificador de velocidad


    public Dificultad() {
    }


    public Dificultad(String nivel, String descripcion, int enemigosExtra, double velocidadJuego) {
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.enemigosExtra = enemigosExtra;
        this.velocidadJuego = velocidadJuego;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEnemigosExtra() {
        return enemigosExtra;
    }

    public void setEnemigosExtra(int enemigosExtra) {
        this.enemigosExtra = enemigosExtra;
    }

    public double getVelocidadJuego() {
        return velocidadJuego;
    }

    public void setVelocidadJuego(double velocidadJuego) {
        this.velocidadJuego = velocidadJuego;
    }

    @Override
    public String toString() {
        return "Dificultad{" +
                "nivel='" + nivel + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", enemigosExtra=" + enemigosExtra +
                ", velocidadJuego=" + velocidadJuego +
                '}';
    }
}
