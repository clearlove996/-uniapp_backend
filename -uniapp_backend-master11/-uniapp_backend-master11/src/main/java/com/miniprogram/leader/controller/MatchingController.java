package com.miniprogram.leader.controller;

import com.miniprogram.leader.service.impl.MatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 匹配控制器，用于处理与教师匹配相关的请求
 */
@RestController
@RequestMapping("/matching")
public class MatchingController {

    // 自动注入匹配服务
    @Autowired
    private MatchingService matchingService;

    /**
     * 根据请求ID和教师ID列表进行教师匹配
     *
     * @param requestId 预约请求的ID
     * @param teacherIds 教师ID的列表，用于进行匹配操作
     * @return 成功时返回匹配通知发送成功的消息
     */
    @PostMapping("/match/{requestId}")
    public ResponseEntity<?> matchTeachers(
            @PathVariable Integer requestId,
            @RequestBody List<Integer> teacherIds) {
        // 调用匹配服务的匹配方法
        matchingService.matchTeachers(requestId, teacherIds);
        // 返回成功消息
        return ResponseEntity.ok("匹配通知发送成功！");
    }
}

