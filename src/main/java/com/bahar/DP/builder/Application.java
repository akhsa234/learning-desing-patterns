package com.bahar.DP.builder;

import com.bahar.DP.builder.Contracts;

public class Application {

    public static void main(String[] args) {
        Contracts contract= new Contracts.ContractBuilder("lisa", "allen")
                .withEmail("abc@gmailtoolkit.com")
                .withPhone(2299334455l).build();

        System.out.println(contract);
    }

}
