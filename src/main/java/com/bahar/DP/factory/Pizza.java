package com.bahar.DP.factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    String name;
    String dough;
    String sauce;
    List toppings= new ArrayList();

    void prepare(){

        System.out.println("preaparing "+ name);
        System.out.println("tossing dough ... "+ dough);
        System.out.println("adding souce "+ sauce);
        System.out.println("adding toppings : ");

        for ( int i=0; i<toppings.size(); i++) {
            System.out.println("   " + toppings.get(i) );

        }
    }
    void bake() {
        System.out.println("baked for 25 min at 350 c");
    }

    void cut() {
        System.out.println("cut in triangle shape");
    }

    void box() {
        System.out.println("boxing in official store box");
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }
    public String getSauce() {
        return sauce;
    }



}
