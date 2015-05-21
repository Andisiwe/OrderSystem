package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Pizza;
import za.ac.cput.myorderapp.Repository.PizzaRepository;
import za.ac.cput.myorderapp.Services.PizzaService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class PizzaServiceImpl implements PizzaService{
    @Autowired
    PizzaRepository repository;

    @Override
    public Pizza getPizzaInfo() {
        Pizza pizza = repository.findOne((long) 1);
        return pizza;
    }
}
