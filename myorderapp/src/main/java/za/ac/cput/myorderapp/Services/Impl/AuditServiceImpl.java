package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.AuditTopping;
import za.ac.cput.myorderapp.Repository.AuditToppingRepository;
import za.ac.cput.myorderapp.Services.AuditToppingService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class AuditServiceImpl implements AuditToppingService {
    @Autowired
    private AuditToppingRepository repository;

    @Override
    public List<AuditTopping> getAuditInfo() {
        List<AuditTopping> allAuditToppings = new ArrayList<>();

        Iterable<AuditTopping> auditToppings = repository.findAll();
        for (AuditTopping auditTopping1 : auditToppings){
            allAuditToppings.add(auditTopping1);
        }
        return allAuditToppings;
    }
}
