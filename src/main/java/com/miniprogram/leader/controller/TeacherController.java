package com.miniprogram.leader.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.miniprogram.leader.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import com.miniprogram.leader.service.TeacherService;
import com.miniprogram.leader.pojo.Teacher;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeacher")
    public Result list() {
        log.info("getTeacher");

        List<Teacher> teacherList = teacherService.list();
        return Result.success(teacherList);
    }

    @PostMapping("/teacher")
    public Result add(@RequestBody Teacher teacher) {
        log.info("add teacher");
        teacherService.add(teacher);
        return Result.success();
    }
}
