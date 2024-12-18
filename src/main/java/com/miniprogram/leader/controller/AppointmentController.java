package com.miniprogram.leader.controller;
import com.miniprogram.leader.service.impl.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/confirm")
    public ResponseEntity<?> confirmAppointment(
            @RequestParam Integer requestId,
            @RequestParam Integer teacherId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date appointmentDate) {
        appointmentService.confirmAppointment(requestId, teacherId, appointmentDate);
        return ResponseEntity.ok("预约成功！");
    }
}