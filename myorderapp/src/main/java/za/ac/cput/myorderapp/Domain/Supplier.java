package za.ac.cput.myorderapp.Domain;

import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Supplier implements Serializable {
    @Id
    private Long supplierNo;

    private String name;
    private String phone;

    private Supplier(){}

    public Supplier(Builder builder){
        this.supplierNo = builder.supplierNo;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public Long getSupplierNo(){return supplierNo;}
    public String getName(){return name;}
    public String getPhone(){return phone;}

    public static class Builder{
        private Long supplierNo;
        private String name;
        private String phone;

        public  Builder(String name){
            this.name = name;
        }

        public Builder supplierNo(Long supplierNo){
            this.supplierNo = supplierNo;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Supplier build(){return new Supplier(this);}
    }
}
