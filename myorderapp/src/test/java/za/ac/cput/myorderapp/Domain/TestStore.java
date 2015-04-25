package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.StoreFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class TestStore {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateStore() throws Exception {
        Map<String, String>values = new HashMap<String, String>();
        values.put("name", "Spar");
        values.put("address", "Grand parade");

        Store store = StoreFactory.createStore(0,values);
        Assert.assertEquals(0, store.getStoreId());

    }

    @Test
    public void testUpdatedStore() throws Exception {
        Map<String, String>values = new HashMap<String, String>();
        values.put("name", "Spar");
        values.put("address", "Grand parade");

        Store store = StoreFactory.createStore(0,values);
        Store newStore = new Store.Builder("Spar")
                                    .copy(store)
                                    .name("Shoprite")
                                    .build();

        Assert.assertNull(newStore.getName());
        Assert.assertEquals(0, store.getStoreId());

    }
}
