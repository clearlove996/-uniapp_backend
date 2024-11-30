package com.miniprogram.leader.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    private Integer id;
    private String Name;
    private String eMail;
    private String grade;
    private Integer age;
    private String gender;
    private String school;
    private String prize;
    private String accompanyTime;
    private String img;
}
