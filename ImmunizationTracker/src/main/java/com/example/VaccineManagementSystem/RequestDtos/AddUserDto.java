package com.example.VaccineManagementSystem.RequestDtos;

import com.example.VaccineManagementSystem.Enum.Gender;
import lombok.Data;


@Data
public class AddUserDto {
    private String name;
    private int age;
    private String emailId;
    private Gender gender;
    private String mobileNo;

}
