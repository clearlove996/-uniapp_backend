package com.miniprogram.leader.mapper;
import com.miniprogram.leader.pojo.Parents;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface ParentsMapper {
    @Insert("insert into parents (name,phone,eMail,age,child_age,child_gender,img,address) values (#{name},#{phone},#{eMail},#{age},#{child_age},#{child_gender},#{img},#{address})")
    void addParents(Parents parents);

    @Update("update parents set name=#{name},eMail=#{eMail},age=#{age},child_age=#{child_age},child_gender=#{child_gender},img=#{img},address=#{address} where phone=#{phone}")
    void updateParents(Parents parents);

    @Update("update parents set teacherSchool=#{teacher_school}, teacherAge=#{teacher_age},teacherGender=#{teacher_gender},teacherNum=#{teacher_num},teacherSalary=#{teacher_salary},commutingTime=#{commuting_time},accompanyContent=#{accompany_content},accompanyTime=#{accompany_time},carallowance=#{car_allowance},trailLesson=#{trail_lesson} where phone=#{phone}")
    void updateParentsRequests(Parents parents);
}
