package com.healthProject.controller;

import com.healthProject.entity.MedicationReminder;
import com.healthProject.payload.MedicationReminderDTO;
import com.healthProject.service.HealthRecordService;
import com.healthProject.service.MedicationReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medication-remainder")
public class MedicationReminderController {

    @Autowired
    private MedicationReminderService medicationReminderService;

    @GetMapping
    public List<MedicationReminderDTO> getAllMedicationRemainder(){
        return medicationReminderService.getAllMedicationReminders();
    }

    @PostMapping
    public ResponseEntity<MedicationReminderDTO> addMedicationReminder(@RequestBody MedicationReminderDTO reminder) {
        MedicationReminderDTO savedto=medicationReminderService.addMedicationReminder(reminder);
        return new ResponseEntity<>(savedto, HttpStatus.CREATED);
    }
}
