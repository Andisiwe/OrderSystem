package za.ac.cput.myorderapp.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.myorderapp.Domain.SalesPerson;

/**
 * Created by student on 2015/05/03.
 */
public interface SalesPersonRepository extends CrudRepository<SalesPerson,Long>{
}
