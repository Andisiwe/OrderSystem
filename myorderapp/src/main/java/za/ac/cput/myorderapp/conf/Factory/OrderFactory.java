package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Orders;

import java.util.Date;

/**
 * Created by student on 2015/04/25.
 */
public class OrderFactory {
    public static Orders createOrder(String orderDate){
        Orders orders = new Orders.Builder(orderDate)
                .build();
        return orders;
    }
}
