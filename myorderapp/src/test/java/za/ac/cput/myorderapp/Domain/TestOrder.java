package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.OrderFactory;

import java.util.Date;

/**
 * Created by student on 2015/04/24.
 */
public class TestOrder {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateOrder() throws Exception {
        Orders orders = OrderFactory.createOrder("10-MAY-15");

        Assert.assertEquals("10-MAY-15", orders.getOrder_date());
    }
}
