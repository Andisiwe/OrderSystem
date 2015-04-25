package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Store;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class StoreFactory {
    public static Store createStore(int storeId, Map<String, String> values){
        Store store = new Store.Builder(values.get("name"))
                .storeId(storeId)
                .address(values.get("address"))
                .build();
        return store;
    }
}
