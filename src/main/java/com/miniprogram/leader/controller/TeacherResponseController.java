package com.miniprogram.leader.controller;

import com.miniprogram.leader.service.impl.TeacherResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher/response")
public class TeacherResponseController {
    @Autowired
    private TeacherResponseService teacherResponseService;

    @PostMapping("/update")
    public ResponseEntity<?> updateResponse(@RequestParam Integer responseId, @RequestParam String status) {
        teacherResponseService.updateResponseStatus(responseId, status);
        return ResponseEntity.ok("老师响应更新成功！");
    }
}
