package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.myorderapp.Domain.AuditTopping;
import za.ac.cput.myorderapp.Services.AuditToppingService;

import java.util.Date;

/**
 * Created by Andies on 2015-05-21.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    /*
    @Autowired
    private AuditToppingService service;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String index(){return "Home Page";}

    @RequestMapping(value = "/auditTopping", method = RequestMethod.GET)
    public AuditTopping getAuditTopping(){
        Date date = new Date();
        AuditTopping auditTopping = new AuditTopping.Builder(date)
                                                    .oldPrice(5)
                                                    .newPrice(7)
                                                    .build();
        return auditTopping;
    }

    @RequestMapping(value = "/auditInfo", method = RequestMethod.GET)
    public AuditTopping getAuditToppings(){return service.getAuditInfo();}*/
}
