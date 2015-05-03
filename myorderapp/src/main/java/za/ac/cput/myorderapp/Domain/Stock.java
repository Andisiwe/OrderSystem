package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Stock implements Serializable {
    @Id
    private Long id;
    private int quantity;

    private Stock(){}

    public Stock(Builder builder){
        this.id = builder.id;
        this.quantity = builder.quantity;
    }

    public Long getId(){return id;}
    public int getQuantity(){return quantity;}

    public static class Builder{
        private Long id;
        private int quantity;

        public Builder(Long id){
            this.id = id;
        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder quantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public Stock build(){return new Stock(this);}
    }
}
