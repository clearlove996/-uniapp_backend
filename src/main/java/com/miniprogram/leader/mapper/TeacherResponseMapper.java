package com.miniprogram.leader.mapper;
import com.miniprogram.leader.pojo.TeacherResponse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import java.util.List;



@Mapper
public interface TeacherResponseMapper {

    @Insert("INSERT INTO teacher_response (request_id, teacher_id, response_message, status) " +
            "VALUES (#{requestId}, #{teacherId}, #{responseMessage}, #{status})")
    void insertTeacherResponse(TeacherResponse teacherResponse);

    @Update("UPDATE teacher_response SET status = #{status} WHERE response_id = #{responseId}")
    void updateResponseStatus(@Param("responseId") Integer responseId, @Param("status") String status);

    @Select("SELECT * FROM teacher_response WHERE request_id = #{requestId}")
    List<TeacherResponse> findByRequestId(@Param("requestId") Integer requestId);
}

