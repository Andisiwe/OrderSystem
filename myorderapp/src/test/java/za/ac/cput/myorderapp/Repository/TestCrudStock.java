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
import za.ac.cput.myorderapp.Domain.Stock;
import za.ac.cput.myorderapp.conf.Factory.StockFactory;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudStock extends AbstractTestNGSpringContextTests {
        private Long id;

        @Autowired
        StockRepository stockRepository;

        @Test
        public void testCreate() throws Exception {
            Stock stock = StockFactory.createStock((long) 1, 22);

            stockRepository.save(stock);
            id = stock.getId();
            Assert.assertNotNull(stock.getId());

        }

        @Test
        public void testRead() throws Exception {
            Stock stock = stockRepository.findOne(id);
            Assert.assertEquals(22, stock.getQuantity());

        }

        @Test
        public void testUpdate() throws Exception {

            Stock stock = stockRepository.findOne(id);
            Stock newStock = StockFactory.createStock((long) 1, 10);

            stockRepository.save(newStock);
            Assert.assertEquals(10, newStock.getQuantity());

        }

        @Test
        public void testDelete() throws Exception {
            Stock stock = stockRepository.findOne(id);
            stockRepository.delete(stock);
            Stock deletedStock = stockRepository.findOne(id);
            Assert.assertNull(deletedStock);

        }

}
