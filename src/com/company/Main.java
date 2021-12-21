package com.company;

public class Main {

    public static void main(String[] args) {

        PizzaLoca pizzaloca = new PizzaLoca();

        pizzaloca.agregarPizza(FactoryPizza.getPizza("muzzarella"));
        pizzaloca.agregarPizza(FactoryPizza.getPizza("especial"));
        pizzaloca.agregarPizza(FactoryPizza.getPizza("ananá"));
        pizzaloca.agregarPizza(FactoryPizza.getPizza("combinada loca"));
        pizzaloca.mostrar();

    }
}
