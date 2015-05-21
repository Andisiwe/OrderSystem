package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Orders;
import za.ac.cput.myorderapp.Repository.OrderRepository;
import za.ac.cput.myorderapp.Services.OrderService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository repository;

    @Override
    public Orders getOrderInfo() {
        Orders orders = repository.findOne((long) 1);
        return orders;
    }
}
