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
import za.ac.cput.myorderapp.Domain.SalesPerson;
import za.ac.cput.myorderapp.conf.Factory.SalesPersonFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudSalesPerson extends AbstractTestNGSpringContextTests {
        private Long id;

        @Autowired
        SalesPersonRepository salesPersonRepository;

        @Test
        public void testCreate() throws Exception {
            SalesPerson salesPerson = SalesPersonFactory.createSalesPerson((long) 1, "Andy", 22);

            salesPersonRepository.save(salesPerson);
            id = salesPerson.getId();
            Assert.assertNotNull(salesPerson.getId());

        }

        @Test
        public void testRead() throws Exception {
            SalesPerson salesPerson = salesPersonRepository.findOne(id);
            Assert.assertEquals("Peter", salesPerson.getName());

        }

        @Test
        public void testUpdate() throws Exception {

            SalesPerson salesPerson= salesPersonRepository.findOne(id);
            SalesPerson newSalesPerson = SalesPersonFactory.createSalesPerson((long) 1, "Andy", 22);

            salesPersonRepository.save(newSalesPerson);
            Assert.assertEquals("Peter", newSalesPerson.getName());

        }

        @Test
        public void testDelete() throws Exception {
            SalesPerson salesPerson = salesPersonRepository.findOne(id);
            salesPersonRepository.delete(salesPerson);
            SalesPerson deletedSalesPerson = salesPersonRepository.findOne(id);
            Assert.assertNull(deletedSalesPerson);

        }

}
