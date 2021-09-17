package com.Work.controller;

import com.Work.entity.DetailEntity;
import com.Work.model.dto.DetailDto;
import com.Work.service.IDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/worker/detail")
public class DetailController {

    @Autowired
    private IDetailService detailService;

    @RequestMapping(value="createOrUpdate",method= RequestMethod.POST)
    public DetailEntity createOrUpdate(@RequestBody DetailDto detailDto){
        return detailService.createOrUpdate(detailDto);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public DetailEntity getById(@PathVariable Long id){
        return detailService.getById(id);
    }

    @RequestMapping(value="{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Long id){
        return detailService.deleteById(id);
    }
}
