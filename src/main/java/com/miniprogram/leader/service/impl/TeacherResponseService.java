package com.miniprogram.leader.service.impl;
import com.miniprogram.leader.mapper.TeacherResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherResponseService {
    @Autowired
    private TeacherResponseMapper teacherResponseMapper;

    public void updateResponseStatus(Integer responseId, String status) {
        teacherResponseMapper.updateResponseStatus(responseId, status);
    }
}
