package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza {

    private List<Pizza> pizzas;

    public Combinada(String nombre) {
        super(nombre);
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        double contador = 0;
        double sumaPrecios = 0;
        for (Pizza pizza: pizzas) {
            contador += 1;
            sumaPrecios += pizza.calcularPrecio();
        }
        return sumaPrecios * (1 / contador);
    }

    @Override

    public String toString() {
        return super.getNombre() + " " + calcularPrecio();
    }


}
