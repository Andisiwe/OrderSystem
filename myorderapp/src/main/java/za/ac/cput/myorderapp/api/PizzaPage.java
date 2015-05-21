package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.myorderapp.Domain.Pizza;
import za.ac.cput.myorderapp.Model.OrderResource;
import za.ac.cput.myorderapp.Model.PizzaResource;
import za.ac.cput.myorderapp.Services.PizzaService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-21.
 */
@RestController
@RequestMapping(value = "pizza/**")
public class PizzaPage {
    /*
    @Autowired
    private PizzaService service;
    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public Pizza getPizza(@PathVariable Long id){
        return service.getPizzaInfo();
    }

    @RequestMapping(value = "/pizzas", method = RequestMethod.GET)
    public List<PizzaResource> getPizzas(){
        List<PizzaResource>hateos = new ArrayList<>();
        Pizza pizza = service.getPizzaInfo();
        PizzaResource resource = new PizzaResource.Builder(pizza.getName())
                                                  .pizza_no(pizza.getPizza_no())
                                                  .price(pizza.getPrice())
                                                  .build();
        Link piz = new Link("http://localhost:8080/pizza"+resource.getPizza_no().toString())
                .withRel("piz");
        return hateos;
    }*/
}
