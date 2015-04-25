package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Delivery;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class DeliveryFactory {
    public static Delivery createDelivery(int deliveryNo,Map<String, String> values){
        Delivery delivery = new Delivery.Builder(values.get("itemDelivered"))
                .deliveryNo(deliveryNo)
                .destination(values.get("destination"))
                .build();
        return delivery;
    }
}
