package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Customer;
import za.ac.cput.myorderapp.Repository.CustomerRepository;
import za.ac.cput.myorderapp.Services.CustomerService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository repository;

    @Override
    public Customer getCustomerInfo() {
        Customer customer = repository.findOne((long) 1);
        return customer;
    }
}
