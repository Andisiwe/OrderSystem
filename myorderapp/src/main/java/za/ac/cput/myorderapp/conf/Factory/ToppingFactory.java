package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Topping;

/**
 * Created by Andies on 2015-05-14.
 */
public class ToppingFactory {
    public static Topping createTopping(double price){
        Topping topping = new Topping.Builder(price)
                                     .build();
        return topping;
    }
}
