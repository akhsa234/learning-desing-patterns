package com.bahar.DP.factory;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    protected Pizza createPizza(String type) {
        return null;
    }
}
