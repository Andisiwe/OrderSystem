package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Customer;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class CustomerFactory {
    public static Customer createCustomer(Map<String, String> values)/* ContactAddress address,
                                          CustomerContactsNos contactsNos, Orders order)*/{
        Customer customer = new Customer.Builder(values.get("name"))
                .surname(values.get("surname"))
             //   .address(address)
              //  .contactNos(contactsNos)
              //  .order(order)
                .build();

        return customer;
    }
}
