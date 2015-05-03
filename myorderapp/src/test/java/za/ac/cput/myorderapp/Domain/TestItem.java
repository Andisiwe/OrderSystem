package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.ItemFactory;
import za.ac.cput.myorderapp.conf.Factory.TotalPriceFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class TestItem {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateItem() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Noodles");
        values.put("brand", "Maggi");
        TotalPrice t = TotalPriceFactory.createTotalPrice(3.00);

        Item item = ItemFactory.createItem(1,values,t);
        Assert.assertEquals("Maggi", item.getBrand());

    }

    @Test
    public void testUpdatedItem() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Noodles");
        values.put("brand", "Maggi");
        TotalPrice t = TotalPriceFactory.createTotalPrice(3.00);

        Item item = ItemFactory.createItem(1,values,t);
        Item newItem = new Item.Builder("Noodles")
                                .copy(item)
                                .brand("Bokomo")
                                .build();

        Assert.assertEquals("Bokomo", newItem.getBrand());
        Assert.assertEquals("Maggi", item.getBrand());

    }
}
