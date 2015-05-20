package za.ac.cput.myorderapp.Domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.myorderapp.conf.Factory.AuditFactory;

import java.util.Date;

/**
 * Created by Andies on 2015-05-14.
 */
public class TestAuditTopping {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateAudit() throws Exception {
        Date date = new Date();
        AuditTopping auditTopping = AuditFactory.createAudit(date,5,7);

        Assert.assertEquals(7, auditTopping.getNewPrice(), 2);

    }
}
