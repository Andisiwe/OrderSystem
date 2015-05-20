package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.PizzaFactory;

/**
 * Created by Andies on 2015-05-14.
 */
public class TestPizza {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreatePizza() throws Exception {
        Pizza pizza = PizzaFactory.createPizza("Something meaty", 60);

        Assert.assertEquals("Something meaty", pizza.getName());

    }
}
