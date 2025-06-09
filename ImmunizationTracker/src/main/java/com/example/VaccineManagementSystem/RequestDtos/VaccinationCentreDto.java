package com.example.VaccineManagementSystem.RequestDtos;

import lombok.Data;

import java.time.LocalTime;

@Data
public class VaccinationCentreDto {
    private String centreName;

    private LocalTime openingTime;

    private LocalTime closingTime;

    private String address;

    private int doseCapacity;

}
