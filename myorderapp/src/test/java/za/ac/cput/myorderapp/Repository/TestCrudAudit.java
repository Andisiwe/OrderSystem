package za.ac.cput.myorderapp.Repository;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import za.ac.cput.myorderapp.App;
import za.ac.cput.myorderapp.Domain.AuditTopping;
import za.ac.cput.myorderapp.conf.Factory.AuditFactory;

import java.util.Date;

/**
 * Created by Andies on 2015-05-19.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudAudit extends AbstractTestNGSpringContextTests {
    private Long id;

    @Autowired
    private AuditToppingRepository repository;

    @Test
    public void create() throws Exception {
        Date date = new Date();
        AuditTopping auditTopping = AuditFactory.createAudit(date, 5, 7);
        repository.save(auditTopping);
        id = auditTopping.getUser_id();
        Assert.assertNotNull(auditTopping.getUser_id());

    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AuditTopping auditTopping = repository.findOne(id);
        Assert.assertNotNull(auditTopping.getUser_id());
        Assert.assertEquals(5, auditTopping.getOldPrice(), 2);


    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        Date date = new Date();
        AuditTopping auditTopping = repository.findOne(id);
        AuditTopping newAudit = new AuditTopping.Builder(date)
                                                .copy(auditTopping)
                                                .newPrice(8)
                                                .build();
        repository.save(newAudit);
        AuditTopping updatedAudit = repository.findOne(id);
        Assert.assertEquals(8, updatedAudit.getNewPrice(), 2);

    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        AuditTopping auditTopping = repository.findOne(id);
        repository.delete(auditTopping);
        AuditTopping deletedAudit = repository.findOne(id);
        Assert.assertNull(deletedAudit);

    }
}
