package com.healthProject.controller;

import com.healthProject.entity.EmergencyContact;
import com.healthProject.payload.EmergencyContactDTO;
import com.healthProject.service.EmergencyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emergency-contacts")
public class EmergencyContactController {
    @Autowired
    private EmergencyContactService emergencyContactService;

    @GetMapping
    public List<EmergencyContactDTO> getAllEmergencyContacts() {
        return emergencyContactService.getAllEmergencyContacts();
    }

    @PostMapping
    public EmergencyContactDTO addEmergencyContact(@RequestBody EmergencyContactDTO contact) {
        return emergencyContactService.addEmergencyContact(contact);
    }
}
