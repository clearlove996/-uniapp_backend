package com.miniprogram.leader.controller;

import com.miniprogram.leader.service.impl.TeacherResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 教师响应控制器，用于处理与教师响应相关的操作
 */
@RestController
@RequestMapping("/teacher/response")
public class TeacherResponseController {

    // 自动注入教师响应服务类
    @Autowired
    private TeacherResponseService teacherResponseService;

    /**
     * 更新教师响应状态
     *
     * @param responseId 响应记录的ID
     * @param status     教师响应的状态（如：同意、拒绝等）
     * @return 返回操作结果，表示响应更新成功
     */
    @PostMapping("/update")
    public ResponseEntity<?> updateResponse(@RequestParam Integer responseId, @RequestParam String status) {
        // 调用服务层方法更新教师响应状态
        teacherResponseService.updateResponseStatus(responseId, status);
        // 返回成功消息
        return ResponseEntity.ok("老师响应更新成功！");
    }
}
