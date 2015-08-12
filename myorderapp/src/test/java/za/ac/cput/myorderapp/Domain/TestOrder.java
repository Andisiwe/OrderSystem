package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.OrderFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class TestOrder {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateOrder() throws Exception {
        //List<Pizza> pizzas = new ArrayList<>();
        Date date = new Date();
        Orders orders = OrderFactory.createOrder(date /*, pizzas*/);

        Assert.assertEquals(date, orders.getOrder_date());
    }
}
