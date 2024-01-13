package com.healthProject.service.impl;

import com.healthProject.Repository.HealthRecordRepository;
import com.healthProject.entity.HealthRecord;
import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.HealthRecordDTO;
import com.healthProject.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Autowired
    private HealthRecordRepository healthRecordRepository;
    @Override
    public void addHealthRecord(HealthRecordDTO healthRecordDTO) {
        HealthRecord healthRecord=new HealthRecord();
        healthRecord.setId(healthRecordDTO.getId());
        healthRecord.setMetric(healthRecordDTO.getMetric());
        healthRecord.setNotes(healthRecordDTO.getNotes());
        healthRecord.setTimestamp(healthRecordDTO.getTimestamp());
        healthRecord.setHeartRate(healthRecordDTO.getHeartRate());
        healthRecord.setBloodPressure(healthRecordDTO.getBloodPressure());
        healthRecordRepository.save(healthRecord);
    }

}
