package com.miniprogram.leader.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentsRequest {

        private Integer requestId;       // 需求ID
        private Integer parentId;        // 家长ID
        private String courseName;       // 课程名称
        private String status;           // 需求状态 (pending, matching, completed, cancelled)
        private Timestamp createdAt;     // 创建时间
        private Timestamp updatedAt;     // 更新时间


        private String teacherSchool;
        private Integer teacherAge;
        private String teacherGender;
        private Integer teacherNum;
        private Integer teacherSalary;
        private String commutingTime;
        private String accompanyContent;
        private String accompanyTime;
        private char carAllowance;
        private char trailLesson;

}
