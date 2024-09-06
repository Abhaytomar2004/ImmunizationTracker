package com.example.VaccineManagementSystem.Transformer;

import com.example.VaccineManagementSystem.Models.User;
import com.example.VaccineManagementSystem.RequestDtos.AddUserDto;
import com.example.VaccineManagementSystem.ResponseDtos.UserResponseDto;

public class UserTransformer {
    public static User ConvertDtoToEntity (AddUserDto addUserDto){
        User user= User.builder()
                .emailId(addUserDto.getEmailId())
                .name(addUserDto.getName())
                .age(addUserDto.getAge())
                .gender(addUserDto.getGender())
                .mobileNo(addUserDto.getMobileNo())
                .build();
        return user;
    }

    public static UserResponseDto ConvertEntityToDto(User user){
        UserResponseDto userResponseDto=UserResponseDto.builder()
                .gender(user.getGender())
                .age(user.getAge())
                .name(user.getName())
                .mobileNo(user.getMobileNo())
                .emailId(user.getEmailId())
                .build();
        return userResponseDto;
    }
}
