package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Store;
import za.ac.cput.myorderapp.Domain.StoreContacts;


/**
 * Created by student on 2015/04/25.
 */
public class StoreFactory {
    public static Store createStore(Long storeId, String name, StoreContacts address){
        Store store = new Store.Builder(name)
                .storeId(storeId)
                .address(address)
                .build();
        return store;
    }
}
