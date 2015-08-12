package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.image.ImageWatched;
import za.ac.cput.myorderapp.Domain.Topping;
import za.ac.cput.myorderapp.Model.ToppingResource;
import za.ac.cput.myorderapp.Services.ToppingService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-21.
 */
@RestController
@RequestMapping(value = "/topping/**")
public class ToppingPage {
    @Autowired
    private ToppingService service;
    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public List<Topping> getTopping(){
        return service.getToppingInfo();
    }

    @RequestMapping(value = "/toppings", method = RequestMethod.GET)
    public List<ToppingResource> getToppings(){
        List<ToppingResource>hateos= new ArrayList<>();
        List<Topping> toppings = service.getToppingInfo();
        for(Topping topping: toppings ) {
            ToppingResource resource = new ToppingResource.Builder(topping.getPrice())
                    .top_code(topping.getTop_code())
                    .build();
            Link top = new Link("http://localhost:8080/topping/" + resource.getTop_code().toString())
                    .withRel("top");
            resource.add(top);
            hateos.add(resource);
        }
        return hateos;
    }
}
