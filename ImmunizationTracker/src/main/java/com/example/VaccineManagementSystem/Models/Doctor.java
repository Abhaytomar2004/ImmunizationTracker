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
@Table(name = "doctors")
@Builder
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generation and auto increment
    int docId;
    String name;
    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @Column(unique = true)
    String emailId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    VaccinationCenter vaccinationCenter;

    @JsonIgnore
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    List<Appointment> appointmentList = new ArrayList<>();
}
