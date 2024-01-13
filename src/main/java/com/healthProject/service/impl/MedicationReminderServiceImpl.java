package com.healthProject.service.impl;

import com.healthProject.Repository.MedicationReminderRepository;
import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.MedicationReminderDTO;
import com.healthProject.service.MedicationReminderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicationReminderServiceImpl implements MedicationReminderService {

    @Autowired
    private MedicationReminderRepository medicationReminderRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<MedicationReminderDTO> getAllMedicationReminders() {
        List<MedicationReminder> medicationReminders=medicationReminderRepository.findAll();
        List<MedicationReminderDTO> medicationReminderDTOS = medicationReminders.stream().map(medicationReminder -> mapToDto(medicationReminder)).collect(Collectors.toList());
        return medicationReminderDTOS;
    }

    @Override
    public MedicationReminderDTO addMedicationReminder(MedicationReminderDTO reminder) {
        MedicationReminder medicationReminder=mapToEntity(reminder);
        MedicationReminder saveRemider=medicationReminderRepository.save(medicationReminder);
        MedicationReminderDTO saveRemiderDto=mapToDto(saveRemider);
        return saveRemiderDto;
    }


    private MedicationReminder mapToEntity(MedicationReminderDTO medicationReminderDTO){
        MedicationReminder medicationReminder= modelMapper.map(medicationReminderDTO, MedicationReminder.class);
        return medicationReminder;
    }
    private MedicationReminderDTO mapToDto(MedicationReminder savedReminder){
        MedicationReminderDTO medicationReminderDTO=modelMapper.map(savedReminder,MedicationReminderDTO.class);
        return medicationReminderDTO;
    }
}
