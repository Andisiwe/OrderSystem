package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.AuditTopping;
import za.ac.cput.myorderapp.Repository.AuditToppingRepository;
import za.ac.cput.myorderapp.Services.AuditToppingService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class AuditServiceImpl implements AuditToppingService {
    @Autowired
    private AuditToppingRepository repository;

    @Override
    public AuditTopping getAuditInfo() {
        AuditTopping auditTopping = repository.findOne((long) 1);
        return auditTopping;
    }
}
