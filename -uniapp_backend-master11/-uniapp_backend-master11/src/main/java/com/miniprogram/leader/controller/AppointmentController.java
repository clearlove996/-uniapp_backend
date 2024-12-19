package com.miniprogram.leader.controller;

import com.miniprogram.leader.service.impl.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

/**
 * 预约控制器，用于处理与预约相关的请求
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    // 自动注入预约服务
    @Autowired
    private AppointmentService appointmentService;

    /**
     * 确认预约接口
     *
     * @param requestId       预约请求的ID
     * @param teacherId       教师的ID
     * @param appointmentDate 预约日期，格式为yyyy-MM-dd
     * @return 成功时返回预约成功的消息
     */
    @PostMapping("/confirm")
    public ResponseEntity<?> confirmAppointment(
            @RequestParam Integer requestId,
            @RequestParam Integer teacherId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date appointmentDate) {
        // 调用预约服务的确认预约方法
        appointmentService.confirmAppointment(requestId, teacherId, appointmentDate);
        // 返回成功消息
        return ResponseEntity.ok("预约成功！");
    }
}
