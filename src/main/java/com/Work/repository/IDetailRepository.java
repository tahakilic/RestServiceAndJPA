package com.Work.repository;

import com.Work.entity.DetailEntity;
import org.springframework.data.repository.CrudRepository;

public interface IDetailRepository extends CrudRepository<DetailEntity,Long> {
}
