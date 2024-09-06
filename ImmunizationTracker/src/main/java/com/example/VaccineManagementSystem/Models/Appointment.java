package com.example.VaccineManagementSystem.Models;

import com.example.VaccineManagementSystem.Enum.AppointmentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.time.LocalTime;

@Entity
@Table(name ="appointments")
@FieldDefaults(level= AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    @Id
    //comment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    Date appointmentDate;

    LocalTime appointmentTime;

    @Enumerated(EnumType.STRING)
    AppointmentStatus appointmentStatus= AppointmentStatus.PENDING;

    @ManyToOne
    @JoinColumn
     Doctor doctor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    User user;



}
