package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.CustomerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class TestCustomer {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateCustomer() throws Exception {
        Map<String, String>values = new HashMap<String, String>();
        values.put("name", "Andisiwe");
        values.put("phone", "12345");
        values.put("email", "@mycput");

        Customer customer = CustomerFactory.createCustomer((long)1, values);
        Assert.assertEquals("Andisiwe", customer.getName());

    }

    @Test
    public void testUpdatedCustomer() throws Exception {
        Map<String, String>values = new HashMap<String, String>();
        values.put("name", "Andisiwe");
        values.put("phone", "12345");
        values.put("email", "@mycput");

        Customer customer = CustomerFactory.createCustomer((long)1,values);
        Customer newCustomer = new Customer.Builder("Andisiwe")
                                            .copy(customer)
                                            .name("Peter")
                                            .build();

        Assert.assertEquals("Peter", newCustomer.getName());
        Assert.assertEquals("Andisiwe", customer.getName());

    }
}
