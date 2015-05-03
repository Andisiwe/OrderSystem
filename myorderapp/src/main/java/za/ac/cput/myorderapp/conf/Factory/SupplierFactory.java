package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.Supplier;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class SupplierFactory {
    public static Supplier createSupplier(Long supplierNo, Map<String, String> values){
        Supplier supplier = new Supplier.Builder(values.get("name"))
                .phone("phone")
                .supplierNo(supplierNo)
                .build();
        return supplier;
    }
}
