package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.StoreContacts;

/**
 * Created by student on 2015/04/25.
 */
public class StoreContactsFactory {
    public static StoreContacts createStoreContacts(String address, String phone){
        StoreContacts storeContacts = new StoreContacts.Builder(address)
                .phone(phone)
                .build();
        return storeContacts;
    }
}
