package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 教师实体类，用于封装教师的基本信息。
 * 该类用于保存教师的个人资料、教育背景以及其他相关的教学信息。
 */
@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
@Data  // 自动生成 getter、setter、toString、equals 和 hashCode 方法
public class Teacher {

    /**
     * 教师的唯一标识符（ID）。
     * 用于在数据库中唯一标识一个教师。
     */
    private Integer id;

    /**
     * 教师的姓名。
     * 存储教师的全名，例如 "张三"。
     */
    private String name;

    /**
     * 教师的电话号码。
     * 用于联系教师，例如 "13800000000"。
     */
    private String phone;

    /**
     * 教师的电子邮箱地址。
     * 用于联系教师，例如 "teacher@example.com"。
     */
    private String eMail;

    /**
     * 教师的年级。
     * 表示教师所教授的年级或学科，例如 "小学五年级"、"初中数学"。
     */
    private String grade;

    /**
     * 教师的年龄。
     * 存储教师的年龄，例如 "35"。
     */
    private Integer age;

    /**
     * 教师的性别。
     * 存储教师的性别信息，可以为 "男" 或 "女"。
     */
    private String gender;

    /**
     * 教师所在的学校。
     * 表示教师所在的学校名称，例如 "某某中学"。
     */
    private String school;

    /**
     * 教师的奖项。
     * 用于记录教师所获得的奖项或荣誉，例如 "优秀教师奖"。
     */
    private String prize;

    /**
     * 教师的陪伴时间。
     * 表示教师愿意陪伴学生的时间段，例如 "周一至周五 3:00 PM - 5:00 PM"。
     */
    private String accompanyTime;

    /**
     * 教师的头像图片路径。
     * 用于存储教师的头像图片文件路径，例如 "images/teacher1.jpg"。
     */
    private String img;

}
