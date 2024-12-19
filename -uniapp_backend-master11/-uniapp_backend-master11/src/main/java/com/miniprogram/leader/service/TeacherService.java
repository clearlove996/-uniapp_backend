package com.miniprogram.leader.service;
import com.miniprogram.leader.pojo.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TeacherService {
    public List<Teacher> list();
    public void addTeacher(Teacher teacher);

    public void updateTeacher(Teacher teacher);
}
