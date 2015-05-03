package za.ac.cput.myorderapp.Repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Delivery;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class TestCrudDelivery {
    private Long id;

    @Autowired
    DeliveryRepository deliveryRepository;

    @Test
    public void testCreate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("itemDelivered", "cake");
        values.put("destination", "harrington");

        Delivery delivery = new Delivery.Builder(values.get("itemDelivered")).deliveryNo((long) 1)
                .destination(values.get("destination")).build();

        deliveryRepository.save(delivery);
        id = delivery.getDeliveryNo();
        Assert.assertNotNull(delivery.getDeliveryNo());

    }

    @Test
    public void testRead() throws Exception {
        Delivery delivery = deliveryRepository.findOne(id);
        Assert.assertEquals("cake", delivery.getItemDelivered());

    }

    @Test
    public void testUpdate() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("itemDelivered", "Pizza");
        values.put("destination", "roland");

        Delivery delivery = deliveryRepository.findOne(id);
        Delivery newDelivery = new Delivery.Builder(values.get("itemDelivered")).deliveryNo(delivery.getDeliveryNo())
                .destination(values.get("destination")).build();
        deliveryRepository.save(newDelivery);
        Assert.assertEquals("Pizza", newDelivery.getItemDelivered());

    }

    @Test
    public void testDelete() throws Exception {
        Delivery delivery = deliveryRepository.findOne(id);
        deliveryRepository.delete(delivery);
        Delivery deletedDelivery = deliveryRepository.findOne(id);
        Assert.assertNull(deletedDelivery);

    }



}
