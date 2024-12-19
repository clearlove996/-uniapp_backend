package com.miniprogram.leader.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import java.util.List;
import com.miniprogram.leader.pojo.Teacher;
import org.springframework.stereotype.Component;

/**
 * 教师信息 Mapper 接口，用于操作数据库中的教师表（teacher）。
 * 提供获取教师列表、插入教师信息以及更新教师信息的功能。
 */
@Mapper  // 标识该接口为 MyBatis 的 Mapper 接口
public interface TeacherMapper {

    /**
     * 获取所有教师的列表
     *
     * @return 返回一个包含所有教师信息的列表
     */
    @Select("select * from teacher")
    List<Teacher> list();

    /**
     * 插入新的教师记录
     *
     * @param teacher 包含教师信息的 Teacher 对象
     */
    @Insert("insert into teacher (name, phone, e_mail, grade, age, gender, school, prize, accompany_time, img) " +
            "values (#{name}, #{phone}, #{eMail}, #{grade}, #{age}, #{gender}, #{school}, #{prize}, #{accompanyTime}, #{img})")
    void addTeacher(Teacher teacher);

    /**
     * 更新已有的教师记录
     *
     * @param teacher 包含教师更新信息的 Teacher 对象
     */
    @Update("update teacher set name=#{name}, e_mail=#{eMail}, grade=#{grade}, age=#{age}, gender=#{gender}, " +
            "school=#{school}, prize=#{prize}, accompany_time=#{accompanyTime}, img=#{img} where phone=#{phone}")
    void updateTeacher(Teacher teacher);
}
