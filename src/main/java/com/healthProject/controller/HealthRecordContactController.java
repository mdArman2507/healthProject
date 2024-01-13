package com.healthProject.controller;
import com.healthProject.payload.HealthRecordDTO;
import com.healthProject.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthRecordContactController {

    @Autowired
    private HealthRecordService healthRecordService;

    @RequestMapping("/api/addhealth")
    @PostMapping
    public ResponseEntity<String> addHealthRecord(@RequestBody HealthRecordDTO healthRecordDTO) {
        healthRecordDTO.setTimestamp(LocalDateTime.now());
        healthRecordService.addHealthRecord(healthRecordDTO);
        return new ResponseEntity<>("Record is Added", HttpStatus.OK);
    }

}
