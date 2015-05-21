package za.ac.cput.myorderapp.Services;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.Base;
import za.ac.cput.myorderapp.Repository.BaseRepository;
import za.ac.cput.myorderapp.conf.Factory.BaseFactory;

/**
 * Created by Andies on 2015-05-20.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class BaseServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private BaseService service;

    private Long id;

    @Autowired
    private BaseRepository repository;
    private Base base;

    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void create() throws Exception {
        Base base = BaseFactory.createBase("Large", 60);
        repository.save(base);
        id = base.getBaseCode();
        Assert.assertNotNull(base.getBaseCode());

    }

    @Test
    public void testGetBaseInfo() throws Exception {
        Base base = service.getBaseInfo();
        Assert.assertNotNull(base);

    }
}
