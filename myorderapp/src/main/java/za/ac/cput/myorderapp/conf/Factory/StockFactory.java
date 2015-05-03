package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Stock;

/**
 * Created by student on 2015/04/25.
 */
public class StockFactory {
    public static Stock createStock(Long id, int quantity){
        Stock stock = new Stock.Builder(id)
                .quantity(quantity)
                .build();
        return stock;
    }
}
