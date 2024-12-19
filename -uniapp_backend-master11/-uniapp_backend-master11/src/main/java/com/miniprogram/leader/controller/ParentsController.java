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

/**
 * 家长控制器，用于处理与家长信息相关的请求
 */
@Slf4j
@RestController
public class ParentsController {

    // 自动注入家长服务
    @Autowired
    private ParentsService parentsService;

    /**
     * 新增家长信息
     *
     * @param parents 家长信息对象
     * @return 操作成功的结果
     */
    @PostMapping("/insertParents")
    public Result addParents(@RequestBody Parents parents) {
        // 日志记录新增家长操作
        log.info("add parents");
        // 调用服务层方法新增家长
        parentsService.addParents(parents);
        // 返回成功结果
        return Result.success();
    }

    /**
     * 更新家长信息
     *
     * @param parents 家长信息对象
     * @return 操作成功的结果
     */
    @PostMapping("/updateParents")
    public Result updateParents(@RequestBody Parents parents) {
        // 日志记录更新家长操作
        log.info("update parents");
        // 调用服务层方法更新家长信息
        parentsService.updateParents(parents);
        // 返回成功结果
        return Result.success();
    }

    /**
     * 更新家长的请求信息
     *
     * @param parents 家长信息对象
     * @return 操作成功的结果
     */
    @PostMapping("/insertParentsRequests")
    public Result updateParentsRequests(@RequestBody Parents parents) {
        // 日志记录更新家长请求信息操作
        log.info("update parents requests");
        // 调用服务层方法更新家长请求信息
        parentsService.updateParents(parents);
        // 返回成功结果
        return Result.success();
    }
}
