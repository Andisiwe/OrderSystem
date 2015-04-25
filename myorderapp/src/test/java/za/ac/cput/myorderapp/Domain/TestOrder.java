package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.OrderFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class TestOrder {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateOrder() throws Exception {
        Map<String, String>values = new HashMap<String, String>();
        values.put("item","Cake");
        values.put("orderedDate", "5-April-2015");
        values.put("shippedDate", "20-April-2015");

        Order order = OrderFactory.createOrder(1, values, 200);
        Assert.assertEquals("5-April-2015", order.getOrderedDate());
    }
}
