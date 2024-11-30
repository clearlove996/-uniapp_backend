package com.miniprogram.leader.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import com.miniprogram.leader.pojo.Teacher;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> list();

    @Insert("insert into teacher (name,e_mail,grade, age, gender,school,prize,accompany_time,img) values (#{name},#{eMail},#{grade},#{age},#{gender},#{school},#{prize},#{accompanyTime},#{img})")
    void insert(Teacher teacher);
}
