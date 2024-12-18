package com.miniprogram.leader.controller;

import com.miniprogram.leader.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.miniprogram.leader.pojo.Parents;
import com.miniprogram.leader.service.ParentsService;
import com.miniprogram.leader.pojo.Teacher;
import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;



@Slf4j
@RestController
public class ParentsController {
    @Autowired
    private ParentsService parentsService;

    @PostMapping("/insertParents")
    public Result addParents(@RequestBody Parents parents){


        log.info("add parents");
        parentsService.addParents(parents);
        return Result.success();

    }


    @PostMapping("/updateParents")
    public Result updateParents(@RequestBody Parents parents){
        log.info("update parents");
        parentsService.updateParents(parents);
        return Result.success();
    }

    @PostMapping("/insertParentsRequests")
    public Result updateParentsRequests(@RequestBody Parents parents){
        log.info("update parents requests");
        parentsService.updateParents(parents);
        return Result.success();
    }




}
