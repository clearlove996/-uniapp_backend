package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * 家长需求请求类（ParentsRequest），用于记录家长对课程的需求请求。
 * 该类用于与数据库中的家长需求请求表进行映射，保存家长的课程需求和相关信息。
 */
@Data  // 自动生成 getter、setter、toString、equals 和 hashCode 方法
@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
public class ParentsRequest {

        /**
         * 需求ID，唯一标识一个家长需求请求。
         * 通常是数据库中的主键。
         */
        private Integer requestId;

        /**
         * 家长ID，表示该需求属于哪个家长。
         * 对应 `Parents` 类中的 `id` 字段。
         */
        private Integer parentId;

        /**
         * 课程名称，家长需求的课程名称。
         * 例如：英语、数学等。
         */
        private String courseName;

        /**
         * 需求状态，表示家长请求的状态。
         * 可能的值：'pending'（待处理）、'matching'（匹配中）、'completed'（已完成）、'cancelled'（已取消）。
         */
        private String status;

        /**
         * 创建时间，记录该需求请求的创建时间。
         * 通常使用 `Timestamp` 类型，精确到毫秒。
         */
        private Timestamp createdAt;

        /**
         * 更新时间，记录需求状态或信息的最后更新时间。
         * 通常在需求状态改变时会更新此字段。
         */
        private Timestamp updatedAt;

        /**
         * 教师所在学校，家长希望匹配的教师所属学校。
         * 用于描述家长对教师的具体要求。
         */
        private String teacherSchool;

        /**
         * 教师的年龄，家长期望的教师年龄范围。
         */
        private Integer teacherAge;

        /**
         * 教师的性别，家长期望的教师性别。
         * 可能的值：'男' 或 '女'。
         */
        private String teacherGender;

        /**
         * 教师的数量，表示家长需求的教师人数。
         */
        private Integer teacherNum;

        /**
         * 教师的薪水，家长期望的教师薪水。
         * 该字段可以根据具体情况设定，单位可能为元或其他。
         */
        private Integer teacherSalary;

        /**
         * 上课通勤时间，家长希望教师的通勤时间。
         * 例如：30分钟、1小时等。
         */
        private String commutingTime;

        /**
         * 陪伴内容，家长对教师陪伴内容的要求。
         * 例如：课后辅导、学习指导等。
         */
        private String accompanyContent;

        /**
         * 陪伴时间，家长希望教师陪伴的时间段。
         * 例如：每周一、周三下午等。
         */
        private String accompanyTime;

        /**
         * 是否提供交通补贴。
         * 'Y' 表示提供交通补贴，'N' 表示不提供。
         */
        private char carAllowance;

        /**
         * 是否提供试听课程。
         * 'Y' 表示提供试听课程，'N' 表示不提供试听课程。
         */
        private char trailLesson;

}

