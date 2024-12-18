package com.miniprogram.leader.controller;
import com.miniprogram.leader.service.impl.MatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/matching")
public class MatchingController {
    @Autowired
    private MatchingService matchingService;

    @PostMapping("/match/{requestId}")
    public ResponseEntity<?> matchTeachers(@PathVariable Integer requestId, @RequestBody List<Integer> teacherIds) {
        matchingService.matchTeachers(requestId, teacherIds);
        return ResponseEntity.ok("匹配通知发送成功！");
    }
}
