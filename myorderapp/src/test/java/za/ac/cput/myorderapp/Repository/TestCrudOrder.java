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
import za.ac.cput.myorderapp.Domain.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudOrder extends AbstractTestNGSpringContextTests {
        private Long id;

        @Autowired
        OrderRepository orderRepository;

        @Test
        public void testCreate() throws Exception {
            Map<String, String> values = new HashMap<String, String>();
            values.put("item", "cake");
            values.put("orderedDate", "10");
            values.put("shippedDate", "11");

            Order order = new Order.Builder(values.get("item")).orderNo((long) 1)
                    .orderedDate(values.get("orderedDate")).shippedDate(values.get("shippedDate")).build();

            orderRepository.save(order);
            id = order.getOrderNo();
            Assert.assertNotNull(order.getOrderNo());

        }

        @Test
        public void testRead() throws Exception {
            Order order = orderRepository.findOne(id);
            Assert.assertEquals("cake", order.getItem());

        }

        @Test
        public void testUpdate() throws Exception {
            Map<String, String> values = new HashMap<String, String>();
            values.put("item", "pizza");
            values.put("orderedDate", "10");
            values.put("shippedDate", "11");

            Order order = orderRepository.findOne(id);
            Order newOrder = new Order.Builder(values.get("item")).orderNo(order.getOrderNo())
                    .orderedDate(values.get("orderdDate")).shippedDate(values.get("shippedDate")).build();
            orderRepository.save(newOrder);
            Assert.assertEquals("pizza", newOrder.getItem());

        }

        @Test
        public void testDelete() throws Exception {
            Order order = orderRepository.findOne(id);
            orderRepository.delete(order);
            Order deletedOrder = orderRepository.findOne(id);
            Assert.assertNull(deletedOrder);

        }
}
