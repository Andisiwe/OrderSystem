package za.ac.cput.myorderapp.Domain;

import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Order implements Serializable {
    @Id
    private Long orderNo;

    private String item;
    private String orderedDate;
    private String shippedDate;
    private double price;

    private Order(){}

    public Order(Builder builder){
        this.orderNo = builder.orderNo;
        this.item = builder.item;
        this.orderedDate = builder.orderedDate;
        this.shippedDate = builder.shippedDate;
        this.price = builder.price;
    }

    public Long getOrderNo(){return orderNo;}
    public String getItem(){return item;}
    public double getPrice(){return price;}
    public String getOrderedDate(){return orderedDate;}
    public String getShippedDate(){return shippedDate;}

    public static class Builder{
        private Long orderNo;
        private String item;
        private String orderedDate;
        private String shippedDate;
        private double price;

        public Builder(String item){
            this.item = item;
        }

        public Builder orderNo(Long orderNo){
            this.orderNo = orderNo;
            return this;
        }

        public Builder item(String item){
            this.item = item;
            return this;
        }

        public Builder price(double price){
            this.price = price;
            return this;
        }

        public Builder orderedDate(String orderedDate){
            this.orderedDate = orderedDate;
            return this;
        }

        public Builder shippedDate(String shippedDate){
            this.shippedDate = shippedDate;
            return this;
        }

        public Order build(){return new Order(this);}
    }

}
