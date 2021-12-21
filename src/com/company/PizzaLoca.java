package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaLoca {

    private List<Pizza> pizzas;

    public PizzaLoca() {
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void mostrar(){

        for (Pizza pizza: pizzas) {
            System.out.println(pizza.toString());
        }
    }

}
