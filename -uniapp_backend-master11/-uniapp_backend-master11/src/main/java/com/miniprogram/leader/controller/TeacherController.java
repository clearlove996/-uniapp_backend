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

    // 注入教师服务类
    @Autowired
    private TeacherService teacherService;

    /**
     * 获取所有教师信息
     *
     * @return 返回所有教师的列表
     */
    @GetMapping("/getTeacher")
    public Result list() {
        log.info("getTeacher");

        // 获取教师列表
        List<Teacher> teacherList = teacherService.list();
        // 返回成功结果并附带教师列表数据
        return Result.success(teacherList);
    }

    /**
     * 添加新的教师信息
     *
     * @param file           教师的头像图片文件
     * @param name           教师姓名
     * @param age            教师年龄
     * @param grade          教师授课年级
     * @param gender         教师性别
     * @param phone          教师联系方式
     * @param eMail          教师电子邮件
     * @param school         教师所属学校
     * @param prize          教师的奖项/荣誉
     * @param preferredDay   教师的偏好授课日期
     * @param preferredTime  教师的偏好授课时间
     * @return 返回操作结果
     */
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
            // 创建一个 Teacher 对象并设置相关属性
            Teacher teacher = new Teacher();
            teacher.setName(name);
            teacher.setAge(age);
            teacher.setGrade(grade);
            teacher.setGender(gender);
            teacher.setPhone(phone);
            teacher.setEMail(eMail);
            teacher.setSchool(school);
            teacher.setPrize(prize);

            // 合并 preferredDay 和 preferredTime 为一个字段 accompanyTime
            String accompanyTime = preferredDay + " " + preferredTime;
            teacher.setAccompanyTime(accompanyTime);  // 设置教师的偏好时间

            // 保存图片并获取图片的路径
            String filePath = saveImageToLocal(file);
            teacher.setImg(filePath);  // 设置教师头像的文件路径

            // 保存教师信息到数据库
            teacherService.addTeacher(teacher);

            log.info("老师添加成功");
            return Result.success();  // 返回成功的响应
        } catch (IOException e) {
            log.error("保存图片失败", e);
            return Result.success("保存图片失败");  // 若图片保存失败，返回失败的响应
        }
    }

    /**
     * 保存图片到本地
     *
     * @param file 图片文件
     * @return 返回保存后的文件路径
     * @throws IOException 若保存过程中出现问题，抛出异常
     */
    private String saveImageToLocal(MultipartFile file) throws IOException {
        // 这里需要一个实际的文件存储路径，请根据你的项目结构设置
        String filePath = "E:\\wechat_devtools\\miniprogram-1\\teacher" + file.getOriginalFilename();

        // 将文件写入到本地文件系统
        file.transferTo(new File(filePath));

        return filePath;  // 返回文件保存路径
    }

    /**
     * 更新教师信息
     *
     * @param teacher 更新的教师对象
     * @return 返回操作结果
     */
    @PostMapping("/updateTeacher")
    public Result update(@RequestBody Teacher teacher) {
        log.info("update teacher");
        // 调用服务层更新教师信息
        teacherService.updateTeacher(teacher);
        return Result.success();  // 返回成功响应
    }
}
