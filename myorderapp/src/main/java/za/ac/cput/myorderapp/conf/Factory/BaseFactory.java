package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Base;
import za.ac.cput.myorderapp.Domain.Pizza;

/**
 * Created by Andies on 2015-05-14.
 */
public class BaseFactory {
    public static Base createBase(String pizzaSize, double price){//} Pizza pizza){
        Base base = new Base.Builder(pizzaSize)
                            .price(price)
                          //  .pizza(pizza)
                            .build();
        return base;
    }
}
