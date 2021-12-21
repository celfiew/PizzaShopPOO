package com.company;

public class Simple extends Pizza{

    private double precio;
    private boolean esGrande;

    public Simple(String nombre, double precio, boolean esGrande) {
        super(nombre);
        this.precio = precio;
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        int duplicar = 2;
        if (this.esGrande){
           precioTotal = this.precio * duplicar;
        } else {
            precioTotal = this.precio;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return super.getNombre() + " " + this.calcularPrecio();
    }
}
