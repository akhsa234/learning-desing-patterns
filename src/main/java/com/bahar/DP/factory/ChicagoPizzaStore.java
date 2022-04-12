package com.bahar.DP.factory;

public class ChicagoPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String item) {

       if (item.equals("cheese")) {
                return new ChicagoStyleCheesePizza();

            } else if (item.equals("veggie")) {
                return new ChicagoVeggieStylePizza();
            } else if (item.equals("calm")) {
                return new ChicagoStyleCalmPizza();
            } else if (item.equals("pepperoni")) {
                return new ChicagoStylePepperoniPizza();
            } else return null;
        }
    }

