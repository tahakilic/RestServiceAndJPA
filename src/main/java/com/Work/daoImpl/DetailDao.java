package com.Work.daoImpl;

import com.Work.dao.IDetailDao;
import com.Work.entity.DetailEntity;
import com.Work.repository.IDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DetailDao implements IDetailDao {

    @Autowired
    private IDetailRepository repository;

    @Override
    public DetailEntity createOrUpdate(DetailEntity detailEntity) {
        return repository.save(detailEntity);
    }

    @Override
    public DetailEntity getById(Long id) {
        DetailEntity detailEntity=repository.findById(id).get();
        return detailEntity;
    }

    @Override
    public int deleteById(Long id) {
        repository.deleteById(id);
        return 1;
    }
}
