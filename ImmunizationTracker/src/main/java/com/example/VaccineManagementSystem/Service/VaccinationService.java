package com.example.VaccineManagementSystem.Service;

import com.example.VaccineManagementSystem.Exceptions.VaccinationAddressNotFound;
import com.example.VaccineManagementSystem.Models.VaccinationCenter;
import com.example.VaccineManagementSystem.Repository.VaccinationCenterRepository;
import com.example.VaccineManagementSystem.RequestDtos.VaccinationCentreDto;
import com.example.VaccineManagementSystem.Transformer.VaccinationCentreTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;
    public String addVaccinationCenter(VaccinationCentreDto vaccinationCenter) throws VaccinationAddressNotFound {

        if(vaccinationCenter.getAddress()==null){
            throw new VaccinationAddressNotFound("Vaccination Address not found");
        }

        VaccinationCenter vaccinationCenterNew= VaccinationCentreTransformer.ConvertDtoToEntity(vaccinationCenter);
        vaccinationCenterRepository.save(vaccinationCenterNew);
        return "Vaccination center added at a location "+vaccinationCenter.getAddress();
    }
}
