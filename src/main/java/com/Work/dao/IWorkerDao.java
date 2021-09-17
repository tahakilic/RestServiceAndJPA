package com.Work.dao;

import com.Work.entity.WorkerEntity;
import java.util.List;

public interface IWorkerDao {
    List<WorkerEntity> getAllList();
    WorkerEntity createOrUpdate(WorkerEntity workerEntity);
    int deleteById(Long id);
    WorkerEntity getById(Long id);
}
