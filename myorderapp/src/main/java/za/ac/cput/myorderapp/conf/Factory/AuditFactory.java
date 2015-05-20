package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.AuditTopping;
import za.ac.cput.myorderapp.Domain.Topping;

import java.util.Date;

/**
 * Created by Andies on 2015-05-14.
 */
public class AuditFactory {
    public static AuditTopping createAudit(Date date, double oldPrice, double newPrice){//} Topping topping){
        AuditTopping auditTopping = new AuditTopping.Builder(date)
                                                    .oldPrice(oldPrice)
                                                    .newPrice(newPrice)
                                                    //.topping(topping)
                                                    .build();
        return auditTopping;
    }
}
