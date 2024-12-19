package com.miniprogram.leader.mapper;

import com.miniprogram.leader.pojo.ParentsRequest;
import org.apache.ibatis.annotations.*;

/**
 * 家长需求请求 Mapper 接口，用于操作数据库中的家长需求表（parent_request）。
 * 提供插入需求请求、更新需求状态和查询需求请求的功能。
 */
@Mapper
public interface ParentsRequestMapper {

    /**
     * 插入新的家长需求请求记录
     *
     * @param parentRequest 包含家长需求请求信息的对象
     */
    @Insert("INSERT INTO parent_request (parents_id, course_name, description, status) " +
            "VALUES (#{parentId}, #{courseName}, #{description}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "requestId")  // 自动生成主键并将其设置到 requestId 字段
    void insertParentsRequest(ParentsRequest parentRequest);

    /**
     * 更新家长需求请求的状态
     *
     * @param requestId 需求请求的ID
     * @param status    新的状态值（例如：待处理、已处理等）
     */
    @Update("UPDATE parent_request SET status = #{status} WHERE request_id = #{requestId}")
    void updateRequestStatus(@Param("requestId") Integer requestId, @Param("status") String status);

    /**
     * 根据需求请求ID查找家长需求请求记录
     *
     * @param requestId 需求请求的ID
     * @return 返回与给定 requestId 相关的家长需求请求对象，如果没有找到则返回 null
     */
    @Select("SELECT * FROM parent_request WHERE request_id = #{requestId}")
    ParentsRequest findById(@Param("requestId") Integer requestId);

}
