package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Order;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class OrderFactory {
    public static Order createOrder(int orderNo, Map<String, String> values, double price){
        Order order = new Order.Builder(values.get("item"))
                .orderNo(orderNo)
                .orderedDate(values.get("orderedDate"))
                .shippedDate(values.get("shippedDate"))
                .price(price)
                .build();
        return order;
    }
}
