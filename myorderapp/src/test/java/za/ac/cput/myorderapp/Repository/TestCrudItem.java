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
import za.ac.cput.myorderapp.Domain.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudItem extends AbstractTestNGSpringContextTests {
        private Long id;

        @Autowired
        ItemRepository itemRepository;

        @Test
        public void testCreate() throws Exception {
            Map<String, String> values = new HashMap<String, String>();
            values.put("name", "noodles");
            values.put("brand", "maggi");

            Item item = new Item.Builder(values.get("name")).itemNo((long) 1)
                    .brand(values.get("brand")).build();

            itemRepository.save(item);
            id = item.getItemNo();
            Assert.assertNotNull(item.getItemNo());

        }

        @Test
        public void testRead() throws Exception {
            Item item = itemRepository.findOne(id);
            Assert.assertEquals("noodles", item.getName());

        }

        @Test
        public void testUpdate() throws Exception {
            Map<String, String> values = new HashMap<String, String>();
            values.put("name", "soup");
            values.put("brand", "knorr");

            Item item = itemRepository.findOne(id);
            Item newItem = new Item.Builder(values.get("name")).itemNo(item.getItemNo())
                    .brand(values.get("brand")).build();
            itemRepository.save(newItem);
            Assert.assertEquals("soup", newItem.getName());

        }

        @Test
        public void testDelete() throws Exception {
            Item item = itemRepository.findOne(id);
            itemRepository.delete(item);
            Item deletedItem = itemRepository.findOne(id);
            Assert.assertNull(deletedItem);

        }



    }
