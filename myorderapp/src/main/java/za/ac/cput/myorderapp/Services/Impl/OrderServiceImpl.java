package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Orders;
import za.ac.cput.myorderapp.Repository.OrderRepository;
import za.ac.cput.myorderapp.Services.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository repository;

    @Override
    public List<Orders> getOrderInfo() {
        List<Orders> orders = new ArrayList<>();

        Iterable<Orders> order = repository.findAll();
        for (Orders orders1 : order){
            orders.add(orders1);
        }

        return orders;
    }
}
