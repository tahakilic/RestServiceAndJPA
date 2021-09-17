package com.Work.daoImpl;

import com.Work.dao.IWorkerDao;
import com.Work.entity.WorkerEntity;
import com.Work.repository.IWorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkerDao implements IWorkerDao {

    @Autowired
    private IWorkerRepository repository;


    @Override
    public List<WorkerEntity> getAllList() {
        List<WorkerEntity> list = (List<WorkerEntity>) repository.findAll();
        return list;
    }

    @Override
    public WorkerEntity createOrUpdate(WorkerEntity workerEntity) {
        return repository.save(workerEntity);
    }

    @Override
    public int deleteById(Long id) {
        repository.deleteById(id);
        return 1;
    }

    @Override
    public WorkerEntity getById(Long id) {
        WorkerEntity workerEntity=repository.findById(id).get();
        return workerEntity;
    }
}
