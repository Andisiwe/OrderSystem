package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.SalesPersonFactory;


/**
 * Created by student on 2015/04/24.
 */
public class TestSalesPerson {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateSalesPerson() throws Exception {
        SalesPerson salesPerson = SalesPersonFactory.createSalesPerson((long)1, "Yamkela", 30);
        Assert.assertEquals(30, salesPerson.getAge());

    }
}
