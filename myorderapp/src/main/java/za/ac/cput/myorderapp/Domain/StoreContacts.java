package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class StoreContacts implements Serializable {
    private String address;
    private String phone;

    public StoreContacts(Builder builder){
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public String getAddress(){return address;}
    public String getPhone(){return phone;}

    public static class Builder{
        private String address;
        private String phone;

        public Builder(String address){
            this.address = address;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder copy(StoreContacts value){
            this.address = value.address;
            this.phone = value.phone;
            return this;
        }

        public StoreContacts build(){return new StoreContacts(this);}
    }
}
