package za.ac.cput.myorderapp.Services;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Customer;
import za.ac.cput.myorderapp.Repository.CustomerRepository;
import za.ac.cput.myorderapp.conf.Factory.CustomerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andies on 2015-05-20.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class CustomerServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private CustomerService service;

    private Long id;

    @Autowired
    private CustomerRepository repository;
    private Customer customer;

    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void create() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Andisiwe");
        values.put("surname", "Peter");

        Customer customer = CustomerFactory.createCustomer(values);
        repository.save(customer);
        id = customer.getId();
        Assert.assertNotNull(customer.getId());

    }

    @Test
    public void testGetCustomerInfo() throws Exception {
        Customer customer = service.getCustomerInfo();
        Assert.assertNotNull(customer);

    }
}
