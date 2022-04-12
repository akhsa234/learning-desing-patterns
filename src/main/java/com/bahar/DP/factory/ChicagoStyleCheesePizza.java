package com.bahar.DP.factory;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name=" chicago Style sauce & cheese pizza.";
        dough = " extra thin crust dough. ";
        sauce = " palm tomato sauce. ";
        toppings.add("shredded mozzarella cheese.");
    }
    void cut(){
        System.out.println("cutting the pizza into square slice.");
    }
}
