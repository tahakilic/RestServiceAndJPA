package com.Work.controller;
import com.Work.entity.WorkerEntity;
import com.Work.model.dto.WorkerDto;
import com.Work.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/worker",produces = "application/json")
public class WorkerController {

    @Autowired
    private IWorkerService workerService;


    @RequestMapping(value = "alllist",method= RequestMethod.GET)
    public List<WorkerEntity> alllist(){
        return workerService.getAllList();
    }

    @RequestMapping(value="createOrUpdate",method = RequestMethod.POST)
    public WorkerEntity createOrUpdate(@RequestBody WorkerDto workerDto){
        return workerService.createOrUpdate(workerDto);
    }

    @RequestMapping(value="{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        return workerService.deleteById(id);
    }

    @RequestMapping(value="{id}",method = RequestMethod.GET)
    public WorkerEntity getById(@PathVariable Long id){
        return workerService.getById(id);
    }

}
