package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.DeliveryFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class TestDelivery {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateDelivery() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("itemDelivered","Pizza");
        values.put("destination", "Caledon street");

        Delivery delivery = DeliveryFactory.createDelivery(1,values);
        Assert.assertEquals("Pizza", delivery.getItemDelivered());

    }

    @Test
    public void testUpdatedDelivery() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("itemDelivered","Pizza");
        values.put("destination", "Caledon street");

        Delivery delivery = DeliveryFactory.createDelivery(1,values);
        Delivery newDelivery = new Delivery.Builder("Pizza")
                                            .copy(delivery)
                                            .itemDelivered("Cake")
                                            .build();

        Assert.assertEquals("Cake", newDelivery.getItemDelivered());
        Assert.assertEquals("Pizza", delivery.getItemDelivered());

    }
}
