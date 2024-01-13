package com.healthProject.service;

import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.MedicationReminderDTO;

import java.util.List;

public interface MedicationReminderService {
     List<MedicationReminderDTO> getAllMedicationReminders();

     MedicationReminderDTO addMedicationReminder(MedicationReminderDTO reminder);
}
