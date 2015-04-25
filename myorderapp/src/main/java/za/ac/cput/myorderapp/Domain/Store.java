package za.ac.cput.myorderapp.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
public class Store implements Serializable {
    private int storeId;
    private String name;
    private String address;

    private Store(){}

    public Store(Builder builder){
        this.storeId = builder.storeId;
        this.name = builder.name;
        this.address = builder.address;
    }

    public int getStoreId(){return storeId;}
    public String getName(){return name;}
    public String getAddress(){return address;}

    public static class Builder{
        private int storeId;
        private String name;
        private String address;

        public Builder(String name){
            this.name = name;
        }

        public Builder storeId(int storeId){
            this.storeId = storeId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder copy(Store value){
            this.storeId = value.storeId;
            this.name = value.name;
            this.address = value.address;
            return this;
        }

        public Store build(){return new Store();}
    }
}
