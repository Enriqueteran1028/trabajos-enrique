/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniels.taller.dominios;

/**
 *
 * @author ESTUDIANTES
 */
public class Vuelos {

    private String origen;
    private String destino;
    private String avion;
    private String areolinea;

    private int tiempoVuelo;
    private int distancia;
    private int valorTiquete;

    public Vuelos() {
    }

    public Vuelos(String origen, String destino, String avion, String areolinea) {
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
        this.areolinea = areolinea;
    }

    public void mostrarDetalle() {
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("---- DETALLE DEL VUELO CREADO ----");
        System.out.println("ORIGEN: " + origen);
        System.out.println("DESTINO: " + destino);
        System.out.println("AEROLINEA: " + areolinea);
        System.out.println("AVION: " + avion);
        System.out.println("TIEMPO DE VUELO: " + tiempoVuelo);
        System.out.println("VALOR DEL TICKETE: " + valorTiquete);
    }
    
    public void generarNombre(String origen, String destino) {
        
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getAreolinea() {
        return areolinea;
    }

    public void setAreolinea(String areolinea) {
        this.areolinea = areolinea;
    }

    public int getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(int tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getValorTiquete() {
        return valorTiquete;
    }

    public void setValorTiquete(int valorTiquete) {
        this.valorTiquete = valorTiquete;
    }
}
