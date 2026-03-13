/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniels.taller.dominios;

/**
 *
 * @author ESTUDIANTES
 */
public class Avion {
    private String codigo;
    private String modelo;
    private String anio;

    public Avion() {
    }

    public Avion(String codigo, String modelo, String anio) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
}
