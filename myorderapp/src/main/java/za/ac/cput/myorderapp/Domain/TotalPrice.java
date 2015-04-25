package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class TotalPrice implements Serializable {
    private double price;

    public TotalPrice(Builder builder){
        this.price = builder.price;
    }

    public double getPrice(){return price;}

    public static class Builder{
        private double price;

        public Builder(double price){
            this.price = price;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder copy(TotalPrice value){
            this.price = value.price;
            return this;
        }

        public TotalPrice build(){return new TotalPrice(this);}
    }
}
