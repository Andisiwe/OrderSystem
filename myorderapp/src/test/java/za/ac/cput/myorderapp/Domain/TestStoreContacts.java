package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.OrderSystemFactory;


/**
 * Created by student on 2015/04/24.
 */
public class TestStoreContacts {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateStoreContacts() throws Exception {

        StoreContacts storeContacts = OrderSystemFactory.createStoreContacts("Harrington", "123456789");
        Assert.assertEquals("Harrington", storeContacts.getAddress());

    }

    @Test
    public void testUpdatedStoreContacts() throws Exception {
        StoreContacts storeContacts = OrderSystemFactory.createStoreContacts("Harrington", "123456789");
        StoreContacts newStoreContacts = new StoreContacts.Builder("Harrington")
                                                            .copy(storeContacts)
                                                            .phone("12345")
                                                            .build();

        Assert.assertEquals("12345", newStoreContacts.getPhone());
        Assert.assertEquals("123456789", storeContacts.getPhone());

    }
}
