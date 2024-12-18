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

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.databind.ObjectMapper;


@Slf4j
@RestController
public class TeacherController {

    //private static String file = "E:\\wechat_devtools\\miniprogram-1\\teacher";

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeacher")
    public Result list() {
        log.info("getTeacher");

        List<Teacher> teacherList = teacherService.list();
        return Result.success(teacherList);
    }

    @PostMapping("/insertTeacher")
    public Result addTeacher(@RequestParam("img") MultipartFile file,
                             @RequestParam("name") String name,
                             @RequestParam("age") Integer age,
                             @RequestParam("grade") String grade,
                             @RequestParam("gender") String gender,
                             @RequestParam("phone") String phone,
                             @RequestParam("eMail") String eMail,
                             @RequestParam("school") String school,
                             @RequestParam("prize") String prize,
                             @RequestParam("preferredDay") String preferredDay,
                             @RequestParam("preferredTime") String preferredTime) {
        try {
            // 创建一个 Teacher 对象，并设置字段
            Teacher teacher = new Teacher();
            teacher.setName(name);
            teacher.setAge(age);
            teacher.setGrade(grade);
            teacher.setGender(gender);
            teacher.setPhone(phone);
            teacher.setEMail(eMail);
            teacher.setSchool(school);
            teacher.setPrize(prize);

            // 合并 preferredDay 和 preferredTime 成 accompanyTime
            String accompanyTime = preferredDay + " " + preferredTime;
            teacher.setAccompanyTime(accompanyTime);  // 设置整合后的时间字段

            // 保存图片到本地并设置路径
            String filePath = saveImageToLocal(file);
            teacher.setImg(filePath);  // 设置图片路径

            // 将Teacher对象保存到数据库
            teacherService.addTeacher(teacher);

            log.info("老师添加成功");
            return Result.success();
        } catch (IOException e) {
            log.error("保存图片失败", e);
            return Result.success("保存图片失败");
        }
    }

    private String saveImageToLocal(MultipartFile file) throws IOException {
        // 这里需要一个实际的文件存储路径，请根据你的项目结构设置
        String filePath = "E:\\wechat_devtools\\miniprogram-1\\teacher" + file.getOriginalFilename();

        // 将文件写入到本地
        file.transferTo(new File(filePath));

        return filePath;
    }

    @PostMapping("/updateTeacher")
    public Result update(@RequestBody Teacher teacher) {
        log.info("update teacher");
        teacherService.updateTeacher(teacher);
        return Result.success();
    }
}
