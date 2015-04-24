package za.ac.cput.myorderapp.Domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by student on 2015/04/24.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCustomer.class,
        TestDelivery.class,
        TestItem.class,
        TestOrder.class,
        TestSalesPerson.class,
        TestStock.class,
        TestStore.class,
        TestStoreContacts.class,
        TestSupplier.class,
        TestTotalPrice.class
})
public class DomainTestSuite {
}
