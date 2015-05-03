package za.ac.cput.myorderapp.Repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class TestCrudCustomer extends AbstractTestNGSpringContextTests {
    private Long id;

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testCreate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Yamkela");
        values.put("phone", "155");
        values.put("email", "a@gmsil");

        Customer customer = new Customer.Builder(values.get("name")).id((long) 1)
                .phone(values.get("phone")).email(values.get("email")).build();

        customerRepository.save(customer);
        id = customer.getId();
        Assert.assertNotNull(customer.getId());

    }

    @Test
    public void testRead() throws Exception {
        Customer customer = customerRepository.findOne(id);
        Assert.assertEquals("Andisiwe", customer.getName());

    }

    @Test
    public void testUpdate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Andisiwe");
        values.put("phone", "155");
        values.put("email", "a@gmsil");

        Customer customer = customerRepository.findOne(id);
        Customer newCustomer = new Customer.Builder(values.get("name")).id(customer.getId())
                .phone(values.get("phone")).email(values.get("email")).build();
        customerRepository.save(newCustomer);
        Assert.assertEquals("Andisiwe", customer.getName());

    }

    @Test
    public void testDelete() throws Exception {
        Customer customer = customerRepository.findOne(id);
        customerRepository.delete(customer);
        Customer deletedCustomer = customerRepository.findOne(id);
        Assert.assertNull(deletedCustomer);

    }


}
