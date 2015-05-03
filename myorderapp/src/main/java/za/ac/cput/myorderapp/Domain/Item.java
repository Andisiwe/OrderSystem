package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Item implements Serializable {
    @Id
    private Long itemNo;

    private String name;
    private String brand;
    @Embedded
    private TotalPrice price;
    //@OneToMany
    //@JoinColumn(name = "item_no")

    private Item(){}

    public Item(Builder builder){
        this.itemNo = builder.itemNo;
        this.name = builder.name;
        this.brand = builder.brand;
        this.price = builder.price;
    }

    public Long getItemNo(){return itemNo;}
    public String getName(){return name;}
    public String getBrand(){return brand;}
    public TotalPrice getPrice(){return price;}

    public static class Builder{
        private Long itemNo;
        private String name;
        private String brand;
        private TotalPrice price;

        public Builder(String name){
            this.name = name;
        }

        public Builder itemNo(Long itemNo){
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

        public Builder price(TotalPrice price){
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
