package com.healthProject.service;

import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.HealthRecordDTO;

import java.util.List;

public interface HealthRecordService {
    void addHealthRecord(HealthRecordDTO healthRecordDTO);

}
