package com.company;

public abstract class Pizza {

    private String nombre;
    private String descripcion;

    public Pizza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPrecio();


}
