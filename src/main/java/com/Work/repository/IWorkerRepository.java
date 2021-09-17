package com.Work.repository;


import com.Work.entity.WorkerEntity;
import org.springframework.data.repository.CrudRepository;

public interface IWorkerRepository extends CrudRepository<WorkerEntity,Long> {
}
