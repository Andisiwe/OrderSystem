package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.TotalPriceFactory;

/**
 * Created by student on 2015/04/24.
 */
public class TestTotalPrice {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateTotalPrice() throws Exception {
        TotalPrice totalPrice = TotalPriceFactory.createTotalPrice(350);
        Assert.assertEquals(350, totalPrice.getPrice(), 2);

    }

    @Test
    public void testUpdatedTotalPrice() throws Exception {
        TotalPrice totalPrice = TotalPriceFactory.createTotalPrice(350);
        TotalPrice newTotalPrice = new TotalPrice.Builder(500)
                                                    .copy(totalPrice)
                                                    .price(500.00)
                                                    .build();

        Assert.assertEquals(500, newTotalPrice.getPrice(), 2);
        Assert.assertEquals(350, totalPrice.getPrice(), 2);

    }
}
