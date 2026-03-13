/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.daniels.taller;

import com.daniels.taller.dominios.Aerolinea;
import com.daniels.taller.dominios.Aeropuertos;
import com.daniels.taller.dominios.Avion;
import com.daniels.taller.dominios.Vuelos;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class Taller {
    
    public static final AEROLINEA = "LATAM AIRLINES";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        Vuelos vuelo = new Vuelos();
        System.out.print("Ingrese origen: ");
        String origen = sc.nextLine();
        vuelo.setOrigen(origen);

        System.out.print("Ingrese destino: ");
        String destino = sc.nextLine();
        vuelo.setDestino(destino);

        System.out.print("Ingrese arerolinea: ");
        String areolinea = sc.nextLine();
        vuelo.setAreolinea(areolinea);

        System.out.print("Ingrese distancia KM: ");
        int distancia = sc.nextInt();
        vuelo.setDistancia(distancia);

        sc.nextLine();

        System.out.print("Ingrese avion: ");
        String avionText = sc.nextLine();
        vuelo.setAvion(avionText);

        int tiempoVu = calcularTiempoVuelo(distancia);
        System.out.print("tiempoVu " + tiempoVu);
        vuelo.setTiempoVuelo(tiempoVu);

        int valorTick = calcularValorTiquete(distancia);
        vuelo.setValorTiquete(valorTick);

        vuelo.mostrarDetalle();

        sc.close();

    }

    public static int calcularTiempoVuelo(int distancia) {
        int velocidadPromedio = 800;
        int valorObtenido = distancia / velocidadPromedio;

        return valorObtenido;
    }

    public static int calcularValorTiquete(int distancia) {
        int precioPorKm = 500;
        return distancia * precioPorKm;
    }
}
