package com.healthProject.service.impl;

import com.healthProject.Repository.EmergencyContactRepository;
import com.healthProject.entity.EmergencyContact;
import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.EmergencyContactDTO;
import com.healthProject.payload.MedicationReminderDTO;
import com.healthProject.service.EmergencyContactService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmergencyContactServiceImpl implements EmergencyContactService {

    @Autowired
    private EmergencyContactRepository emergencyContactRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<EmergencyContactDTO> getAllEmergencyContacts() {
        List<EmergencyContact> emergencyContacts=emergencyContactRepository.findAll();
        List<EmergencyContactDTO> emergencyContactDTOS=emergencyContacts.stream().map(emergencyContact -> mapToDto(emergencyContact)).collect(Collectors.toList());
        return emergencyContactDTOS;
    }

    @Override
    public EmergencyContactDTO addEmergencyContact(EmergencyContactDTO contact) {
        EmergencyContact emergencyContact=mapToEntity(contact);
        EmergencyContact saveContact=emergencyContactRepository.save(emergencyContact);

        return mapToDto(saveContact);
    }

    private EmergencyContact mapToEntity(EmergencyContactDTO emergencyContactDTO){
        EmergencyContact emergencyContact= modelMapper.map(emergencyContactDTO, EmergencyContact.class);
        return emergencyContact;
    }
    private EmergencyContactDTO mapToDto(EmergencyContact emergencyContact){
        EmergencyContactDTO emergencyContactDTO=modelMapper.map(emergencyContact,EmergencyContactDTO.class);
        return emergencyContactDTO;
    }
}
