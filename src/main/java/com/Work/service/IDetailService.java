package com.Work.service;

import com.Work.entity.DetailEntity;
import com.Work.model.dto.DetailDto;

public interface IDetailService {
    DetailEntity createOrUpdate(DetailDto detailDto);
    DetailEntity getById(Long id);
    String deleteById(Long id);
}
