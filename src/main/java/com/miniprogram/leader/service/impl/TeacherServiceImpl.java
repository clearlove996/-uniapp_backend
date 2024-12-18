package com.miniprogram.leader.service.impl;
import com.miniprogram.leader.service.TeacherService;
import java.util.List;
import com.miniprogram.leader.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import com.miniprogram.leader.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> list() {
        return teacherMapper.list();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher){
        teacherMapper.updateTeacher(teacher);
    }
}
