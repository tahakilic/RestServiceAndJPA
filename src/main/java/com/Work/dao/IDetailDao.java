package com.Work.dao;

import com.Work.entity.DetailEntity;

public interface IDetailDao {
    DetailEntity createOrUpdate(DetailEntity detailEntity);
    DetailEntity getById(Long id);
    int deleteById(Long id);

}
