package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Store implements Serializable {
    @Id
    private Long storeId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    @Embedded
    private StoreContacts address;
   // @OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "store_id")

    private Store(){}

    public Store(Builder builder){
        this.storeId = builder.storeId;
        this.name = builder.name;
        this.address = builder.address;
    }

    public Long getStoreId(){return storeId;}
    public String getName(){return name;}
    public StoreContacts getAddress(){return address;}

    public static class Builder{
        private Long storeId;
        private String name;
        private StoreContacts address;

        public Builder(String name){
            this.name = name;
        }

        public Builder storeId(Long storeId){
            this.storeId = storeId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(StoreContacts address){
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
