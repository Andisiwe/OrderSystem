package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.SupplierFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class TestSupplier {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateSupplier() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Andisiwe");
        values.put("phone", "222222");

        Supplier supplier = SupplierFactory.createSupplier((long)1, values);
        Assert.assertEquals("Andisiwe", supplier.getName());

    }
}
