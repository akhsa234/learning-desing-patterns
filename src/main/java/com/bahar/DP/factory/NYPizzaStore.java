package com.bahar.DP.factory;

public class NYPizzaStore extends PizaStore{

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();

        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("calm")) {
            return new NYStyleCalmPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }


}
