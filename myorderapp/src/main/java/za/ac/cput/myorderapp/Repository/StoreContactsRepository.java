package za.ac.cput.myorderapp.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.myorderapp.Domain.StoreContacts;

/**
 * Created by student on 2015/05/03.
 */
public interface StoreContactsRepository extends CrudRepository<StoreContacts, Long>{
}
