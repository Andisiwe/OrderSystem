package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.StockFactory;

/**
 * Created by student on 2015/04/24.
 */
public class TestStock {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateStock() throws Exception {
        Stock stock = StockFactory.createStock((long)1,10);
        Assert.assertEquals(10, stock.getQuantity());

    }

}
