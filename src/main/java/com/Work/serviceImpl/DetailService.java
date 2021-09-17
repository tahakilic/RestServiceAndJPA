package com.Work.serviceImpl;

import com.Work.dao.IDetailDao;
import com.Work.entity.DetailEntity;
import com.Work.model.dto.DetailDto;
import com.Work.service.IDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService implements IDetailService {

    @Autowired
    private IDetailDao detailDao;

    @Override
    public DetailEntity createOrUpdate(DetailDto detailDto) {
        DetailEntity detailEntity=null;
        if(detailDto.getId()==null){
            detailEntity=new DetailEntity();
        }else{
            detailEntity=detailDao.getById(detailDto.getId());
        }
        detailEntity.setAddress(detailDto.getAddress());
        detailEntity.setDescription(detailDto.getDescription());
        detailEntity.setAreaOfInterest(detailDto.getAreaOfInterest());
        detailEntity.setWorkInLocations(detailDto.getWorkInLocations());
        detailEntity.setPrice(detailDto.getPrice());
        return detailDao.createOrUpdate(detailEntity);
    }

    @Override
    public DetailEntity getById(Long id) {
        return detailDao.getById(id);
    }

    @Override
    public String deleteById(Long id) {
        int result=detailDao.deleteById(id);
        return result==1?"başarılı":"başarısız";
    }
}
