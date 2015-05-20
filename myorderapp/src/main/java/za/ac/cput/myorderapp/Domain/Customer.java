package za.ac.cput.myorderapp.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/04/23.
 */
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cust_id;
    private String name;
    private String surname;
   /* @Embedded
    private ContactAddress address;
    private CustomerContactsNos contactsNos;
   /* @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_id")
    private Order order;*/

    public Customer(){}

    public Customer(Builder builder){
        this.cust_id = builder.cust_id;
        this.name = builder.name;
        this.surname = builder.surname;
       /* this.address = builder.address;
        this.contactsNos = builder.contactNos;
        this.order = builder.order;*/
    }

    public Long getId(){return cust_id;}
    public String getName(){return name;}
    public String getSurname(){return surname;}
   /* public ContactAddress getAddress(){return address;}
    public CustomerContactsNos getContactsNos(){return contactsNos;}
    public Order getOrder(){return order;}*/



    public static class Builder{
        private Long cust_id;
        private String name;
        private String surname;
       /* private ContactAddress address;
        private CustomerContactsNos contactNos;
        private Order order;*/


        public Builder(String name){
            this.name = name;
        }

        public Builder id(Long id){
            this.cust_id = id;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

       /* public Builder address(ContactAddress address){
            this.address = address;
            return this;
        }

        public Builder contactNos(CustomerContactsNos contactNos){
            this.contactNos = contactNos;
            return this;
        }

        public Builder order(Order order){
            this.order = order;
            return this;
        }*/

        public Builder copy(Customer value){
            this.cust_id = value.cust_id;
            this.name = value.name;
            this.surname = value.surname;
          /*  this.address = value.address;
            this.contactNos = value.contactsNos;
            this.order = value.order;*/
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
