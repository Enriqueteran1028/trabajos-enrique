package ejecucion;

import dominio.Personajes;

public class Principal {
    public static void main(String[] args) {
        System.out.println("App de Videojuego");


        Personajes p1 = new Personajes();
        p1.nombre = "Scorpion";
        p1.habilidad = "Teletransportación";
        p1.armamento = "Cadenas";
        p1.cantidadVidas = 3;

        Personajes p2 = new Personajes("Sub-Zero", "Control de hielo", "Espada de hielo", 5);

        System.out.println("Personaje 1: " + p1.nombre + " - " + p1.habilidad);
        System.out.println("Personaje 2: " + p2.nombre + " - " + p2.habilidad);
    }
}
