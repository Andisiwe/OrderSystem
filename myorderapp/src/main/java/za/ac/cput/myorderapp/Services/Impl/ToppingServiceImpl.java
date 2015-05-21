package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Topping;
import za.ac.cput.myorderapp.Repository.ToppingRepository;
import za.ac.cput.myorderapp.Services.ToppingService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class ToppingServiceImpl implements ToppingService{
    @Autowired
    ToppingRepository repository;

    @Override
    public Topping getToppingInfo() {
        Topping topping = repository.findOne((long) 1);
        return topping;
    }
}
