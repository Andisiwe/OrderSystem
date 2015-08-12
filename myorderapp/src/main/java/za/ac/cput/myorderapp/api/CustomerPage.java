package za.ac.cput.myorderapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.myorderapp.Domain.Customer;
import za.ac.cput.myorderapp.Model.CustomerResource;
import za.ac.cput.myorderapp.Services.CustomerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-21.
 */
@RestController
@RequestMapping(value = "/customer/**")
public class CustomerPage {
    @Autowired
    private CustomerService service;
    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public List<Customer> getCustomer(@PathVariable Long id){
        return service.getCustomerInfo();
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<CustomerResource> getCustomers() {
        List<CustomerResource> hateos = new ArrayList<>();
        List<Customer> customer = service.getCustomerInfo();
        for(Customer customer1: customer) {
            CustomerResource resource = new CustomerResource.Builder(customer1.getName())
                    .surname(customer1.getSurname())
                    .id(customer1.getId())
                    .build();
            Link cust = new Link("http://localhost:8080/customer/" + resource.getCust_Id().toString())
                    .withRel("cust");
            resource.add(cust);
            hateos.add(resource);
        }
        
        return hateos;
    }
}
