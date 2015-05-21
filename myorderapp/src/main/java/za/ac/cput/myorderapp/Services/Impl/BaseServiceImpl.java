package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Base;
import za.ac.cput.myorderapp.Repository.BaseRepository;
import za.ac.cput.myorderapp.Services.BaseService;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    BaseRepository repository;

    @Override
    public Base getBaseInfo() {
        Base base = repository.findOne((long) 1);
        return base;
    }
}
