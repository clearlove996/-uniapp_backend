
package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 父母信息类（Parents），用于存储父母的相关信息。
 * 该类用于与数据库中的父母信息表（如：parents）进行映射。
 *
 * @author [Your Name]
 */
@AllArgsConstructor  // 自动生成带所有字段的构造函数
@NoArgsConstructor   // 自动生成无参构造函数
@Data  // 自动生成 Getter、Setter、toString、equals 和 hashCode 方法
public class Parents {

    /**
     * 父母的唯一标识符（ID）。
     */
    private Integer id;

    /**
     * 父母的姓名。
     */
    private String name;

    /**
     * 父母的联系电话。
     */
    private String phone;

    /**
     * 父母的电子邮件地址。
     */
    private String eMail;

    /**
     * 父母的年龄。
     */
    private Integer age;

    /**
     * 孩子的年龄。
     */
    private Integer child_age;

    /**
     * 孩子的性别。
     * 可能的值：'男' 或 '女'。
     */
    private String child_gender;

    /**
     * 父母的头像图片路径。
     * 存储的是图片文件在服务器上的路径。
     */
    private String img;

    /**
     * 父母的家庭住址。
     */
    private String address;

    /**
     * 父母预约的时间（如：看老师、学习等）。
     * 该字段用于记录父母的预约时间。
     */
    private String appointmentTime;

    /**
     * 父母预约的地点（如：线下授课地点或其他）。
     * 该字段用于记录父母的预约地点。
     */
    private String appointmentPlace;

    // 其他字段：未来可能用于记录电话、课程相关信息等

    /**
     * 电话调用前方。
     * 该字段可能用于存储一些电话服务相关的信息，具体业务需求需进一步补充。
     */
    // private String phoneCallingInfo;  // 可扩展

    /**
     * 课程调用前方。
     * 该字段可能用于存储课程相关的信息，具体业务需求需进一步补充。
     */
    // private String courseCallingInfo;  // 可扩展
}
