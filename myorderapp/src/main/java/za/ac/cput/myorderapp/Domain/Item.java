package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class Item implements Serializable {
    private int itemNo;
    private String name;
    private String brand;
    private double price;

    private Item(){}

    public Item(Builder builder){
        this.itemNo = builder.itemNo;
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    public int getItemNo(){return itemNo;}
    public String getName(){return name;}
    public String getBrand(){return brand;}
    public double getPrice(){return price;}

    public static class Builder{
        private int itemNo;
        private String name;
        private String brand;
        private double price;

        public Builder(String name){
            this.name = name;
        }

        public Builder itemNo(int itemNo){
            this.itemNo = itemNo;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder brand(String brand){
            this.brand = brand;
            return  this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder copy(Item value){
            this.itemNo = value.itemNo;
            this.name = value.name;
            this.brand = value.brand;
            this.price = value.price;
            return this;
        }

        public Item build(){return new Item(this);}

    }
}
