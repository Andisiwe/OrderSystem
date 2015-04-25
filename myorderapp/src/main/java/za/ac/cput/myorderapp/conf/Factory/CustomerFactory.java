package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Customer;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class CustomerFactory {
    public static Customer createCustomer(int id, Map<String, String> values){
        Customer customer = new Customer.Builder(values.get("name"))
                .id(id)
                .phone(values.get("phone"))
                .email(values.get("email"))
                .build();

        return customer;
    }
}
