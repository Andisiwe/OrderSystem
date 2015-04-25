package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class Customer implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String email;

    public Customer(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}

    public static class Builder{
        int id;
        String name;
        String phone;
        String email;

        public Builder(String name){
            this.name = name;
        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder copy(Customer value){
            this.id = value.id;
            this.name = value.name;
            this.phone = value.phone;
            this.email = value.email;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
