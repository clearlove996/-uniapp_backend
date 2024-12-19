package com.miniprogram.leader.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniprogram.leader.pojo.ParentsRequest;
import com.miniprogram.leader.service.impl.ParentsRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 家长请求控制器，用于处理家长提交的请求相关操作
 */
@RestController
@RequestMapping("/parent/request")
public class ParentsRequestController {

    // 自动注入家长请求服务
    @Autowired
    private ParentsRequestService parentRequestService;

    /**
     * 提交家长请求
     *
     * @param request 家长请求对象，包含家长的需求信息
     * @return 返回操作结果，表示请求已成功提交
     */
    @PostMapping("/submit")
    public ResponseEntity<?> submitRequest(@RequestBody ParentsRequest request) {
        // 调用服务层的提交请求方法
        parentRequestService.submitRequest(request);
        // 返回请求提交成功的响应
        return ResponseEntity.ok("需求提交成功！");
    }
}
