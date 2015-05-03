package za.ac.cput.myorderapp.Repository;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCrudCustomer.class,
        TestCrudDelivery.class,
        TestCrudItem.class,
        TestCrudOrder.class,
        TestCrudSalesPerson.class,
        TestCrudStock.class,
        TestCrudStore.class,
        TestCrudSupplier.class
})
public class RepositoryTestSuite {
}
