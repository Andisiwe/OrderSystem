package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderNo;
    private String order_date;
  /*  @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "pizza_no")
    private Pizza pizza;*/

    private Orders(){}

    public Orders(Builder builder){
        this.orderNo = builder.orderNo;
        this.order_date = builder.order_date;
       // this.pizza = builder.pizza;
    }

    public Long getOrderNo(){return orderNo;}
    public String getOrder_date(){return order_date;}
   // public Pizza getPizza(){return pizza;}

    public static class Builder{
        private Long orderNo;
        private String order_date;
       // private Pizza pizza;

        public Builder(String order_date){
            this.order_date = order_date;
        }

        public Builder orderNo(Long orderNo){
            this.orderNo = orderNo;
            return this;
        }

       /* public Builder pizza(Pizza pizza){
            this.pizza = pizza;
            return this;
        }*/

        public Orders build(){return new Orders(this);}
    }

}
