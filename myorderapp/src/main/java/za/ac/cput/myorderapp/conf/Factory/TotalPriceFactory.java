package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.TotalPrice;

/**
 * Created by student on 2015/04/25.
 */
public class TotalPriceFactory {
    public static TotalPrice createTotalPrice(double price){
        TotalPrice totalPrice = new TotalPrice.Builder(price)
                .build();
        return totalPrice;
    }
}
