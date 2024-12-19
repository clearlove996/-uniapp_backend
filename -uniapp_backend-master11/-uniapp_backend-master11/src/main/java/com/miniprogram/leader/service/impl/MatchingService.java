package com.miniprogram.leader.service.impl;
import com.miniprogram.leader.mapper.TeacherResponseMapper;
import com.miniprogram.leader.pojo.TeacherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class MatchingService {
    @Autowired
    private TeacherResponseMapper teacherResponseMapper;

    public void matchTeachers(Integer requestId, List<Integer> teacherIds) {
        for (Integer teacherId : teacherIds) {
            TeacherResponse response = new TeacherResponse();
            response.setRequestId(requestId);
            response.setTeacherId(teacherId);
            response.setResponseMessage("系统自动生成通知");
            response.setStatus("pending");
            teacherResponseMapper.insertTeacherResponse(response);
        }
    }
}
