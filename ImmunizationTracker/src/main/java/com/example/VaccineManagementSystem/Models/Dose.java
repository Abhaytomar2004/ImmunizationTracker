package com.example.VaccineManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dose")
@Builder
public class Dose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id; //Primary Key

    @Column(unique = true)
    String doseId; //Unique

    @CreationTimestamp
    Date vaccinationDate;

    @JsonIgnore  //to stop infinite recursion
    @OneToOne
    @JoinColumn
    User user;


}
