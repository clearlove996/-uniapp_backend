package com.miniprogram.leader.mapper;

import com.miniprogram.leader.pojo.TeacherResponse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * 教师回应 Mapper 接口，用于操作数据库中的教师回应表（teacher_response）。
 * 提供插入教师回应、更新回应状态以及根据请求ID查询教师回应的功能。
 */
@Mapper  // 标识该接口为 MyBatis 的 Mapper 接口
public interface TeacherResponseMapper {

    /**
     * 插入新的教师回应记录
     *
     * @param teacherResponse 包含教师回应信息的对象
     */
    @Insert("INSERT INTO teacher_response (request_id, teacher_id, response_message, status) " +
            "VALUES (#{requestId}, #{teacherId}, #{responseMessage}, #{status})")
    void insertTeacherResponse(TeacherResponse teacherResponse);

    /**
     * 更新教师回应的状态
     *
     * @param responseId 教师回应的ID
     * @param status    新的状态值（例如：已接受、已拒绝等）
     */
    @Update("UPDATE teacher_response SET status = #{status} WHERE response_id = #{responseId}")
    void updateResponseStatus(@Param("responseId") Integer responseId, @Param("status") String status);

    /**
     * 根据需求请求ID查找教师回应记录
     *
     * @param requestId 需求请求的ID
     * @return 返回与给定 requestId 相关的教师回应记录的列表
     */
    @Select("SELECT * FROM teacher_response WHERE request_id = #{requestId}")
    List<TeacherResponse> findByRequestId(@Param("requestId") Integer requestId);
}
