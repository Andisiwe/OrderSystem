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
import za.ac.cput.myorderapp.Domain.Supplier;
import za.ac.cput.myorderapp.conf.Factory.SupplierFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class TestCrudSupplier extends AbstractTestNGSpringContextTests {
        private Long id;

        @Autowired
        SupplierRepository supplierRepository;

        @Test
        public void testCreate() throws Exception {
            Map<String, String>values = new HashMap<String, String>();
            values.put("name", "Lewis");
            values.put("phone", "155");

            Supplier supplier = SupplierFactory.createSupplier((long)1, values);
            supplierRepository.save(supplier);
            id = supplier.getSupplierNo();
            Assert.assertNotNull(supplier.getSupplierNo());

        }

        @Test
        public void testRead() throws Exception {
            Supplier supplier = supplierRepository.findOne(id);
            Assert.assertEquals("Lewis", supplier.getName());

        }

        @Test
        public void testUpdate() throws Exception {
            Map<String, String>values = new HashMap<String, String>();
            values.put("name", "Senzo");
            values.put("phone", "155");

            Supplier supplier = supplierRepository.findOne(id);
            Supplier newSupplier = SupplierFactory.createSupplier((long)1, values);
            supplierRepository.save(newSupplier);
            Assert.assertEquals("Senzo", newSupplier.getName());

        }

        @Test
        public void testDelete() throws Exception {
            Supplier supplier = supplierRepository.findOne(id);
            supplierRepository.delete(supplier);
            Supplier deletedSupplier = supplierRepository.findOne(id);
            Assert.assertNull(deletedSupplier);

        }

}
