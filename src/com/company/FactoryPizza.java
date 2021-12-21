package com.company;

public class FactoryPizza {

    public static Pizza getPizza(String nombrePizza){
        Pizza result = null;
        switch (nombrePizza){
            case "muzzarella":
                result = new Simple("muzzarella", 700,false);
                return result;
            case "especial":
                result = new Simple("especial", 850,false);
                return result;
            case "ananá":
                result = new Simple("ananá", 950,false);
                return result;
            case "combinada loca":
                result = new Combinada("combinada loca");
                ((Combinada) result).agregarPizza(FactoryPizza.getPizza("especial"));
                ((Combinada) result).agregarPizza(FactoryPizza.getPizza("ananá"));
                return result;
            default:
                return null;
        }
    }
}
