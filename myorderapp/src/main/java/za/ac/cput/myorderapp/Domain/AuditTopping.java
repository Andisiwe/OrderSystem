package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Andies on 2015-05-14.
 */
@Entity
public class AuditTopping implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private Date dateChanged;
    private double oldPrice;
    private double newPrice;
   /* @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "top_code")
    private Topping topping;*/

    private AuditTopping(){}

    public AuditTopping(Builder builder){
        this.user_id = builder.user_id;
        this.dateChanged = builder.dateChanged;
        this.oldPrice = builder.oldPrice;
        this.newPrice = builder.newPrice;
        //this.topping = builder.topping;
    }

    public Long getUser_id() {
        return user_id;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

   /* public Topping getTopping() {
        return topping;
    }*/

    public static class Builder{
        private Long user_id;
        private Date dateChanged;
        private double oldPrice;
        private double newPrice;
      //  private Topping topping;

        public Builder(Date dateChanged){
            this.dateChanged = dateChanged;
        }

        public Builder user_id(Long user_id){
            this.user_id = user_id;
            return this;
        }

        public Builder oldPrice(double oldPrice){
            this.oldPrice = oldPrice;
            return this;
        }

        public Builder newPrice(double newPrice){
            this.newPrice = newPrice;
            return this;
        }

       /* public Builder topping(Topping topping){
            this.topping = topping;
            return this;
        }*/

        public Builder copy(AuditTopping value){
            this.user_id = value.user_id;
            this.dateChanged = value.dateChanged;
            this.oldPrice = value.oldPrice;
            this.newPrice = value.newPrice;
            return this;
        }

        public AuditTopping build(){return new AuditTopping(this);}

    }
}
