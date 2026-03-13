/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniels.taller.dominios;

/**
 *
 * @author ESTUDIANTES
 */
public class Aeropuertos {
    private String nombre;
    private String codigo;
    private String ciudad;

    public Aeropuertos() {
         
    }
    
    public Aeropuertos(String nombre, String codigo, String ciudad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciudad = ciudad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
