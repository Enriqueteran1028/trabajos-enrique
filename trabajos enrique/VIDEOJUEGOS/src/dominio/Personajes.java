package dominio;

public class Personajes {
    public String nombre;
    public String habilidad;
    public String armamento;
    public int cantidadVidas;

    // Constructor vacío
    public Personajes() {
    }

    // Constructor con parámetros
    public Personajes(String nombre, String habilidad, String armamento, int cantidadVidas) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.armamento = armamento;
        this.cantidadVidas = cantidadVidas;
    }

    // Métodos opcionales (aunque no uses private, puedes tenerlos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
