package za.ac.cput.myorderapp.Services;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Orders;
import za.ac.cput.myorderapp.Repository.OrderRepository;
import za.ac.cput.myorderapp.conf.Factory.OrderFactory;

/**
 * Created by Andies on 2015-05-20.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class OrderServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private OrderService service;

    private Long id;

    @Autowired
    private OrderRepository repository;
    private Orders orders;

    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void create() throws Exception {
        Orders orders = OrderFactory.createOrder("2015-05-20");
        repository.save(orders);
        id = orders.getOrderNo();
        Assert.assertNotNull(orders.getOrderNo());

    }

    @Test
    public void testGetOrderInfo() throws Exception {
        Orders orders = service.getOrderInfo();
        Assert.assertNotNull(orders);

    }
}
