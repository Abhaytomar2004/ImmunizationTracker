package com.example.VaccineManagementSystem.Controller;

import com.example.VaccineManagementSystem.Exceptions.VaccinationAddressNotFound;
import com.example.VaccineManagementSystem.RequestDtos.VaccinationCentreDto;
import com.example.VaccineManagementSystem.Service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationController {
    @Autowired
    VaccinationService vaccinationService;

    @PostMapping("/add")
    public ResponseEntity<String> addCenter(@RequestBody VaccinationCentreDto vaccinationCentreDto) {
        try {
            String result = vaccinationService.addVaccinationCenter(vaccinationCentreDto);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (VaccinationAddressNotFound e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
