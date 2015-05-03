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
import za.ac.cput.myorderapp.Domain.Store;
import za.ac.cput.myorderapp.Domain.StoreContacts;

/**
 * Created by student on 2015/05/02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class TestCrudStore extends AbstractTestNGSpringContextTests {
    private Long id;

    @Autowired
    StoreRepository storeRepository;

    @Test
    public void testCreate() throws Exception {
        StoreContacts storeContacts = new StoreContacts.Builder("Darling").build();
        Store store = new Store.Builder("Pep").storeId((long) 1).address(storeContacts).build();
        storeRepository.save(store);
        id = store.getStoreId();
        Assert.assertNotNull(store.getStoreId());

    }

   @Test
    public void testRead() throws Exception {
        Store store = storeRepository.findOne(id);
        Assert.assertEquals("Pep", store.getName());

    }

    @Test
    public void testUpdate() throws Exception {
        StoreContacts storeContacts = new StoreContacts.Builder("Darling").build();
        Store store = storeRepository.findOne(id);
        Store newStore = new Store.Builder("Frydays").storeId(store.getStoreId())
                .address(storeContacts).build();
        storeRepository.save(newStore);
        Assert.assertEquals("Frydays", store.getName());

    }

    @Test
    public void testDelete() throws Exception {
        Store store = storeRepository.findOne(id);
        storeRepository.delete(store);
        Store deletedStore = storeRepository.findOne(id);
        Assert.assertNull(deletedStore);

    }
}
