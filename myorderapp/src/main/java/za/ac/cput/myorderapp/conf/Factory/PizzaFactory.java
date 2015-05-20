package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Pizza;

/**
 * Created by Andies on 2015-05-14.
 */
public class PizzaFactory {
    public static Pizza createPizza(String name, double price){
        Pizza pizza = new Pizza.Builder(name)
                                .price(price)
                                .build();
        return pizza;
    }
}
