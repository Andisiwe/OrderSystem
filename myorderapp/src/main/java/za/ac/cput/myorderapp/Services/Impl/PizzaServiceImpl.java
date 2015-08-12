package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Pizza;
import za.ac.cput.myorderapp.Repository.PizzaRepository;
import za.ac.cput.myorderapp.Services.PizzaService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class PizzaServiceImpl implements PizzaService{
    @Autowired
    PizzaRepository repository;

    @Override
    public List<Pizza> getPizzaInfo() {
        List<Pizza> pizzas = new ArrayList<>();

        Iterable<Pizza> pizza = repository.findAll();
        for (Pizza pizza1 : pizza){
            pizzas.add(pizza1);
        }

        return pizzas;
    }
}
