package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.myorderapp.Domain.Orders;
import za.ac.cput.myorderapp.Model.OrderResource;
import za.ac.cput.myorderapp.Services.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Andies on 2015-05-21.
 */
@RestController
@RequestMapping(value = "/order/**")
public class OrderPage {
   /* @Autowired
    private OrderService service;
    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public Orders getOrder(@PathVariable Long id){
        return service.getOrderInfo();
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<OrderResource> getOrders(){
        List<OrderResource>hateos = new ArrayList<>();
        Orders orders = service.getOrderInfo();
        OrderResource resource = new OrderResource.Builder(orders.getOrder_date())
                                                  .orderNo(orders.getOrderNo())
                                                  .build();
        Link ord = new Link("http://localhost:8080/order"+resource.getOrderNo().toString())
                .withRel("ord");
        return hateos;
    }*/
}
