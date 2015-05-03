package za.ac.cput.myorderapp.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class SalesPerson implements Serializable {
    @Id
    private int id;

    private String name;
    private int age;

    private SalesPerson(){}

    public SalesPerson(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}

    public static class Builder{
        private int id;
        private String name;
        private int age;

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

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public SalesPerson build(){return new SalesPerson(this);}
    }
}
