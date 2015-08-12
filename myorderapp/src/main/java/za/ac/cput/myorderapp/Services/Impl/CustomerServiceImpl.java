package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Customer;
import za.ac.cput.myorderapp.Repository.CustomerRepository;
import za.ac.cput.myorderapp.Services.CustomerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> getCustomerInfo() {
        List<Customer> customers = new ArrayList<>();

        Iterable<Customer> customers1s = repository.findAll();
        for (Customer customer1 : customers1s){
            customers.add(customer1);
        }

        return customers;
    }
}
