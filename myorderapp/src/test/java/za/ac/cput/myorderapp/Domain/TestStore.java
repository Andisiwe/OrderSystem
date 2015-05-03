package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.StoreContactsFactory;
import za.ac.cput.myorderapp.conf.Factory.StoreFactory;


/**
 * Created by student on 2015/04/24.
 */
public class TestStore {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateStore() throws Exception {
        StoreContacts s = StoreContactsFactory.createStoreContacts("kloof", "111111");
        Store store = StoreFactory.createStore((long) 0, "Spar", s);
        Assert.assertNull("Spar", store.getName());

    }

    @Test
    public void testUpdatedStore() throws Exception {
        StoreContacts s = StoreContactsFactory.createStoreContacts("kloof", "111111");
        Store store = StoreFactory.createStore((long) 1, "Spar", s);
        Store newStore = new Store.Builder("Spar")
                                    .copy(store)
                                    .name("Shoprite")
                                    .build();

        Assert.assertNull(newStore.getName());
        Assert.assertNull("Shoprite", newStore.getName());

    }
}
