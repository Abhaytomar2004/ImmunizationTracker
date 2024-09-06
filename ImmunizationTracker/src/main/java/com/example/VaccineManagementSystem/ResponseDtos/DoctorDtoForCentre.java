package com.example.VaccineManagementSystem.ResponseDtos;

import com.example.VaccineManagementSystem.Enum.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDtoForCentre {
    private String name;
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
