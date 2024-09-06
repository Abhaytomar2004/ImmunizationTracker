package com.example.VaccineManagementSystem.Transformer;

import com.example.VaccineManagementSystem.Models.VaccinationCenter;
import com.example.VaccineManagementSystem.RequestDtos.VaccinationCentreDto;

public class VaccinationCentreTransformer {

    public static VaccinationCenter ConvertDtoToEntity(VaccinationCentreDto vaccinationCentreDto){

        return VaccinationCenter.builder()
                .doseCapacity(vaccinationCentreDto.getDoseCapacity())
                .centreName(vaccinationCentreDto.getCentreName())
                .closingTime(vaccinationCentreDto.getClosingTime())
                .openingTime(vaccinationCentreDto.getOpeningTime())
                .address(vaccinationCentreDto.getAddress())
                .build();
    }

}
