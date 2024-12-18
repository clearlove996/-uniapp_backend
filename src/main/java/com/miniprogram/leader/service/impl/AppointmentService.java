package com.miniprogram.leader.service.impl;
import com.miniprogram.leader.mapper.AppointmentMapper;
import com.miniprogram.leader.mapper.ParentsRequestMapper;
import com.miniprogram.leader.pojo.Appointment;
import com.miniprogram.leader.pojo.ParentsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class AppointmentService {
    @Autowired
    private AppointmentMapper appointmentMapper;
    @Autowired
    private ParentsRequestMapper parentRequestMapper;

    public void confirmAppointment(Integer requestId, Integer teacherId, Date appointmentDate) {
        // 更新家长需求状态
        parentRequestMapper.updateRequestStatus(requestId, "completed");

        // 插入预约记录
        Appointment appointment = new Appointment();
        appointment.setRequestId(requestId);
        appointment.setTeacherId(teacherId);
        appointment.setAppointmentDate(appointmentDate);
        appointment.setStatus("confirmed");
        appointmentMapper.insertAppointment(appointment);
    }
}
