package com.miniprogram.leader.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import com.miniprogram.leader.pojo.Teacher;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> list();

    @Insert("insert into teacher (name,phone,e_mail,grade, age, gender,school,prize,accompany_time,img) values (#{name},#{phone},#{eMail},#{grade},#{age},#{gender},#{school},#{prize},#{accompanyTime},#{img})")
    void addTeacher(Teacher teacher);

    @Update("update teacher set name=#{name},e_mail=#{eMail},grade=#{grade}, age=#{age}, gender=#{gender},school=#{school},prize=#{prize},accompany_time=#{accompanyTime},img=#{img} where phone=#{phone}")
    void updateTeacher(Teacher teacher);
}
