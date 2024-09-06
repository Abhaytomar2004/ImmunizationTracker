package com.example.VaccineManagementSystem.RequestDtos;

import lombok.Data;

@Data
public class CancelAppointmentRequestDto {
    private Integer appointmentId;
    private Integer userId;
}
