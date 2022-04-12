package com.bahar.DP.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        Pizza pizza=null;

        if (type.equals("cheese")) {
            return new CheesePizza();

        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else if (type.equals("calm")) {
            return new CalmPizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else return pizza;
    }
}
