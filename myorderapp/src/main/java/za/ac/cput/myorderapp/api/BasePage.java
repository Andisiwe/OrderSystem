package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.myorderapp.Domain.Base;
import za.ac.cput.myorderapp.Model.BaseResource;
import za.ac.cput.myorderapp.Services.BaseService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/11.
 */
@RestController
@RequestMapping(value = "/base/**")
public class BasePage {
    @Autowired
    private BaseService service;

    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public List<Base> getBase(@PathVariable Long id){
        return service.getBaseInfo();
    }

    @RequestMapping(value = "/bases", method = RequestMethod.GET)
    public List<BaseResource> getBases() {
        List<BaseResource> hateos = new ArrayList<>();
        List<Base> bases = service.getBaseInfo();
        for(Base base1: bases) {
            BaseResource resource = new BaseResource.Builder(base1.getPizzaSize())
                    .price(base1.getPrice())
                    .baseCode(base1.getBaseCode())
                    .build();
            Link cust = new Link("http://localhost:8080/base/" + resource.getBaseCode().toString())
                    .withRel("cust");
            resource.add(cust);
            hateos.add(resource);
        }

        return hateos;
    }
}
