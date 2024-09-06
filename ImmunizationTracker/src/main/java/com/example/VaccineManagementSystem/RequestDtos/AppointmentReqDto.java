package com.example.VaccineManagementSystem.RequestDtos;

import com.example.VaccineManagementSystem.Enum.AppointmentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.sql.Date;
import java.time.LocalTime;
@Data
public class AppointmentReqDto {
    private Integer docId;

    private Integer userId;

    private Date appointmentDate;

    private LocalTime appointmentTime;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;
}
