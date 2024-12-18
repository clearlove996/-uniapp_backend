package com.miniprogram.leader.mapper;
import com.miniprogram.leader.pojo.ParentsRequest;

import org.apache.ibatis.annotations.*;


@Mapper
public interface ParentsRequestMapper {
    @Insert("INSERT INTO parent_request (parents_id, course_name, description, status) " +
            "VALUES (#{parentId}, #{courseName}, #{description}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "requestId")
    void insertParentsRequest(ParentsRequest parentRequest);

    @Update("UPDATE parent_request SET status = #{status} WHERE request_id = #{requestId}")
    void updateRequestStatus(@Param("requestId") Integer requestId, @Param("status") String status);

    @Select("SELECT * FROM parent_request WHERE request_id = #{requestId}")
    ParentsRequest findById(@Param("requestId") Integer requestId);

}