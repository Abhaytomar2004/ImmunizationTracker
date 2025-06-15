package com.example.VaccineManagementSystem.Models;

import com.example.VaccineManagementSystem.Enum.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity 
@FieldDefaults(level= AccessLevel.PRIVATE)
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto generated
    int userId;

    @Column(name = "user_name")
    String name;
    String father_name;

    int age;
    String mobileNo;

    @Column(unique = true)
    String emailId;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @JsonIgnore
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
     Dose dose;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Appointment> appointmentList = new ArrayList<>();

}
