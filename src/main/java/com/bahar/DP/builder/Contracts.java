package com.bahar.DP.builder;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Contracts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private long phone;
    @Column
    private String email;

    public Contracts(ContractBuilder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.email=builder.email;
        this.phone= builder.phone;
    }

    public Contracts() {}


    public static class ContractBuilder{

        private String firstName;
        private String lastName;
        private long phone;
        private String email;


        public ContractBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Contracts build(){
            return new Contracts(this);
        }

        public ContractBuilder withEmail(String email){
            this.email=email;
            return this;
        }


        public ContractBuilder withPhone(long phone){
            this.phone=phone;
            return this;

        }
    }




}
