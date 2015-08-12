package za.ac.cput.myorderapp.Services;

import za.ac.cput.myorderapp.Domain.AuditTopping;

import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
public interface AuditToppingService {
    List<AuditTopping> getAuditInfo();
}
