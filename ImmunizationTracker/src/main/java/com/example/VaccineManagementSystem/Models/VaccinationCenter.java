package com.example.VaccineManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vaccination_center")
@Builder
public class VaccinationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String centreName;
    LocalTime openingTime;
    LocalTime closingTime;
    String address;
    int doseCapacity;

    @JsonIgnore
    @OneToMany (mappedBy ="vaccinationCenter" ,cascade=CascadeType.ALL)
     List<Doctor> doctorList = new ArrayList<>();


}
