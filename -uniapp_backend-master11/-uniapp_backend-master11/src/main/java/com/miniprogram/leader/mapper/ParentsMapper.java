package com.miniprogram.leader.mapper;

import com.miniprogram.leader.pojo.Parents;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * 家长信息 Mapper 接口，用于操作数据库中的家长（parents）表。
 * 提供添加家长信息、更新家长信息和更新家长需求信息的功能。
 */
@Mapper
public interface ParentsMapper {

    /**
     * 添加家长信息
     *
     * @param parents 包含家长信息的 Parents 对象
     */
    @Insert("insert into parents (name, phone, eMail, age, child_age, child_gender, img, address) " +
            "values (#{name}, #{phone}, #{eMail}, #{age}, #{child_age}, #{child_gender}, #{img}, #{address})")
    void addParents(Parents parents);

    /**
     * 更新家长信息
     *
     * @param parents 包含家长更新信息的 Parents 对象
     */
    @Update("update parents set name=#{name}, eMail=#{eMail}, age=#{age}, child_age=#{child_age}, " +
            "child_gender=#{child_gender}, img=#{img}, address=#{address} where phone=#{phone}")
    void updateParents(Parents parents);

    /**
     * 更新家长需求信息
     *
     * @param parents 包含家长需求更新信息的 Parents 对象
     */
    @Update("update parents set teacherSchool=#{teacher_school}, teacherAge=#{teacher_age}, " +
            "teacherGender=#{teacher_gender}, teacherNum=#{teacher_num}, teacherSalary=#{teacher_salary}, " +
            "commutingTime=#{commuting_time}, accompanyContent=#{accompany_content}, accompanyTime=#{accompany_time}, " +
            "carallowance=#{car_allowance}, trailLesson=#{trail_lesson} where phone=#{phone}")
    void updateParentsRequests(Parents parents);
}
