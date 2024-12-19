package com.miniprogram.leader.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private Integer appointmentId;   // 预约ID
    private Integer requestId;       // 家长需求ID
    private Integer teacherId;       // 老师ID
    private Date appointmentDate;    // 预约日期
    private String status;           // 预约状态 (confirmed, cancelled)
    private Timestamp createdAt;     // 创建时间
    private Timestamp updatedAt;     // 更新时间
}
