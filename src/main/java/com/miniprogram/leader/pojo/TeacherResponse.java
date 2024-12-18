package com.miniprogram.leader.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherResponse {
    private Integer responseId;      // 响应ID
    private Integer requestId;       // 家长需求ID
    private Integer teacherId;       // 老师ID
    private String responseMessage;  // 老师对需求的回复
    private String status;           // 响应状态 (pending, accepted, rejected)
    private Timestamp createdAt;     // 创建时间
    private Timestamp updatedAt;     // 更新时间
}
