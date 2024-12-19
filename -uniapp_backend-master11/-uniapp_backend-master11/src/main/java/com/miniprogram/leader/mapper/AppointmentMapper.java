package com.miniprogram.leader.mapper;

import com.miniprogram.leader.pojo.Appointment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 预约 Mapper 接口，用于操作数据库中的预约表（appointment）
 */
@Mapper
public interface AppointmentMapper {

    /**
     * 插入新的预约记录
     *
     * @param appointment 预约对象，包含请求ID、教师ID、预约日期和状态等信息
     */
    @Insert("INSERT INTO appointment (request_id, teacher_id, appointment_date, status) " +
            "VALUES (#{requestId}, #{teacherId}, #{appointmentDate}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "appointmentId")  // 自动生成主键并设置到对象的appointmentId字段
    void insertAppointment(Appointment appointment);

    /**
     * 更新预约状态
     *
     * @param appointmentId 预约记录的ID
     * @param status        要更新的状态（例如：已确认、已取消等）
     */
    @Update("UPDATE appointment SET status = #{status} WHERE appointment_id = #{appointmentId}")
    void updateAppointmentStatus(@Param("appointmentId") Integer appointmentId, @Param("status") String status);

    /**
     * 根据请求ID查询预约记录
     *
     * @param requestId 预约请求的ID
     * @return 返回找到的预约对象，如果没有找到则返回null
     */
    @Select("SELECT * FROM appointment WHERE request_id = #{requestId}")
    Appointment findByRequestId(@Param("requestId") Integer requestId);
}
