package com.example.VaccineManagementSystem.RequestDtos;

import lombok.Data;

import java.sql.Date;

@Data
public class ChangeAppointmentDate {
    private Integer appointmentId;
    private Integer userId;
    private Date date;
}
