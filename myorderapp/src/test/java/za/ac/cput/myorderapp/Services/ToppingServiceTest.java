package za.ac.cput.myorderapp.Services;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Topping;
import za.ac.cput.myorderapp.Repository.ToppingRepository;
import za.ac.cput.myorderapp.conf.Factory.ToppingFactory;

/**
 * Created by Andies on 2015-05-20.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class ToppingServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ToppingService service;

    private Long id;

    @Autowired
    private ToppingRepository repository;
    private Topping topping;

    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void create() throws Exception {
        Topping topping = ToppingFactory.createTopping(5);
        repository.save(topping);
        id = topping.getTop_code();
        Assert.assertNotNull(topping.getTop_code());

    }

    @Test
    public void testGetToppingInfo() throws Exception {
        Topping topping = service.getToppingInfo();
        Assert.assertNotNull(topping);

    }
}
