package za.ac.cput.myorderapp.conf.Factory;

import za.ac.cput.myorderapp.Domain.SalesPerson;

/**
 * Created by student on 2015/04/25.
 */
public class SalesPersonFactory {
    public static SalesPerson createSalesPerson(int id, String name, int age){
        SalesPerson salesPerson = new SalesPerson.Builder(name)
                .id(id)
                .age(age)
                .build();
        return salesPerson;
    }
}
