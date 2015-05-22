package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Andies on 2015-05-14.
 */
@Entity
public class Topping implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long top_code;
    private double price;

    private Topping(){}

    public Topping(Builder builder){
        this.top_code = builder.top_code;
        this.price = builder.price;
    }

    public Long getTop_code() {
        return top_code;
    }

    public double getPrice() {
        return price;
    }

    public static class Builder{
        private Long top_code;
        private double price;

        public Builder(double price){
            this.price = price;
        }

        public Builder top_code(Long top_code){
            this.top_code = top_code;
            return this;
        }

        public Topping build(){
            return new Topping(this);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}