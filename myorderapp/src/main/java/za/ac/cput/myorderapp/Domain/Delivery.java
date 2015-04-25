package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class Delivery implements Serializable {
    private int deliveryNo;
    private String itemDelivered;
    private String destination;

    private Delivery(){}

    public Delivery(Builder builder){
        this.deliveryNo = builder.deliveryNo;
        this.itemDelivered = builder.itemDelivered;
        this.destination = builder.destination;
    }

    public int getDeliveryNo(){return deliveryNo;}
    public String getItemDelivered(){return itemDelivered;}
    public String getDestination(){return destination;}

    public static class Builder{
        private int deliveryNo;
        private String itemDelivered;
        private String destination;

        public Builder(String itemDelivered){
            this.itemDelivered = itemDelivered;
        }

        public Builder deliveryNo(int deliveryNo){
            this.deliveryNo = deliveryNo;
            return this;
        }

        public Builder itemDelivered(String itemDelivered){
            this.itemDelivered = itemDelivered;
            return this;
        }

        public Builder destination(String destination){
            this.destination = destination;
            return this;
        }

        public Builder copy(Delivery value){
            this.deliveryNo = value.deliveryNo;
            this.itemDelivered = value.itemDelivered;
            this.destination = value.destination;
            return this;
        }

        public Delivery build(){return new Delivery(this);}


    }
}