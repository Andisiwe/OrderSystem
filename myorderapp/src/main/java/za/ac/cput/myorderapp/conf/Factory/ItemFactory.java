package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Item;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class ItemFactory {
    public static Item createItem(int itemNo, Map<String, String> values, double price){
        Item item = new Item.Builder(values.get("name"))
                .itemNo(itemNo)
                .brand(values.get("brand"))
                .price(price)
                .build();
        return item;
    }
}
