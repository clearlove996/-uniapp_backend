package com.miniprogram.leader.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Parents {
    private Integer id;
    private String name;
    private String phone;
    private String eMail;
    private Integer age;
    private Integer child_age;
    private String child_gender;
    private String img;
    private String address;


    private String appointmentTime;
    private String appointmentPlace;
    // 电话调用前方
    // 课程调用前方

}
