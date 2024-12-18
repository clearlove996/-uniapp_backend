package com.miniprogram.leader.mapper;
import com.miniprogram.leader.pojo.Appointment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AppointmentMapper {

    @Insert("INSERT INTO appointment (request_id, teacher_id, appointment_date, status) " +
            "VALUES (#{requestId}, #{teacherId}, #{appointmentDate}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "appointmentId")
    void insertAppointment(Appointment appointment);

    @Update("UPDATE appointment SET status = #{status} WHERE appointment_id = #{appointmentId}")
    void updateAppointmentStatus(@Param("appointmentId") Integer appointmentId, @Param("status") String status);

    @Select("SELECT * FROM appointment WHERE request_id = #{requestId}")
    Appointment findByRequestId(@Param("requestId") Integer requestId);
}
