package com.example.VaccineManagementSystem.Transformer;

import com.example.VaccineManagementSystem.Models.Doctor;
import com.example.VaccineManagementSystem.RequestDtos.AddDoctorDto;
import com.example.VaccineManagementSystem.ResponseDtos.DoctorDtoForCentre;

public class DoctorTransformer {
    public static Doctor convertDtoToEntity(AddDoctorDto addDoctorDto){
        Doctor doctor=Doctor.builder().
                name(addDoctorDto.getName()).
                age(addDoctorDto.getAge()).
                emailId(addDoctorDto.getEmailId())
                .gender(addDoctorDto.getGender())
                .build();
        return doctor;
    }

    public static DoctorDtoForCentre doctorToDoctorDtoForCentre(Doctor doctor) {
        DoctorDtoForCentre doctorDto = DoctorDtoForCentre.builder()
                .name(doctor.getName())
                .gender(doctor.getGender())
                .age(doctor.getAge())
                .build();
        return doctorDto;
    }
}
