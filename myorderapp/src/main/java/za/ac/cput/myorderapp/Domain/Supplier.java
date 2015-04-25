package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class Supplier implements Serializable {
    private int supplierNo;
    private String name;
    private String phone;

    private Supplier(){}

    public Supplier(Builder builder){
        this.supplierNo = builder.supplierNo;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public int getSupplierNo(){return supplierNo;}
    public String getName(){return name;}
    public String getPhone(){return phone;}

    public static class Builder{
        private int supplierNo;
        private String name;
        private String phone;

        public  Builder(String name){
            this.name = name;
        }

        public Builder supplierNo(int supplierNo){
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
