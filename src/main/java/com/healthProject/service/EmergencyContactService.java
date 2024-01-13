package com.healthProject.service;

import com.healthProject.entity.EmergencyContact;
import com.healthProject.payload.EmergencyContactDTO;

import java.util.List;

public interface EmergencyContactService {
    List<EmergencyContactDTO> getAllEmergencyContacts();

    EmergencyContactDTO addEmergencyContact(EmergencyContactDTO contact);
}
