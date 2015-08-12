package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Topping;
import za.ac.cput.myorderapp.Repository.ToppingRepository;
import za.ac.cput.myorderapp.Services.ToppingService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class ToppingServiceImpl implements ToppingService{
    @Autowired
    ToppingRepository repository;

    @Override
    public List<Topping> getToppingInfo() {
        List<Topping> toppings = new ArrayList<>();

        Iterable<Topping> topping = repository.findAll();
        for (Topping topping1 : topping){
            toppings.add(topping1);
        }

        return toppings;
    }
}
