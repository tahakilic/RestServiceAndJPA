package com.Work.service;

import com.Work.entity.WorkerEntity;
import com.Work.model.dto.WorkerDto;

import java.util.List;

public interface IWorkerService {
    List<WorkerEntity> getAllList();
    WorkerEntity createOrUpdate(WorkerDto workerDto);
    String deleteById(Long id);
    WorkerEntity getById(Long id);

}
