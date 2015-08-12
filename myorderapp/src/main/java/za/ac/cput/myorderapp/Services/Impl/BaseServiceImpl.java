package za.ac.cput.myorderapp.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.myorderapp.Domain.Base;
import za.ac.cput.myorderapp.Repository.BaseRepository;
import za.ac.cput.myorderapp.Services.BaseService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andies on 2015-05-20.
 */
@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    BaseRepository repository;

    @Override
    public List<Base> getBaseInfo() {
        List<Base> bases = new ArrayList<>();
        Iterable<Base> values = repository.findAll();
        for (Base value : values) {
            bases.add(value);
        }

        return bases;
    }
}
