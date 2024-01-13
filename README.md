
# Project Name
  HEALTH RECORD

This project is there are 3 entity 
  1. Health RecordContact
  2. MedicationReminder
  3. Emergency Contact


HealthRecord Entity
    private Long id (id is generated automatically)
    private LocalDateTime timestamp;
    private String metric;
    private double bloodPressure;
    private int heartRate;
    private String notes;
    

MedicatioReminder Entity
    private Long id;
    private LocalDateTime timestamp;
    private String medicationName;
    private String dosage;
    private String notes;
    

Emergency Contact
    private Long id;
    private String name;
    private String relationship;
    private String phoneNumber;



## Overview

   1.  In this project the healthRecord entity add the health,like metric,bloodPressuer,heartRate,some notes and we post to save the data and also fetch the data 
   2.  the MedicationReminder are two alert the MedicationName and Doses
   3.   Contact are two call the emergency call
   4.   I'm also using third-party intrigation ModelMapper.
     

## Getting Started

### Prerequisites
Tools ->  IntelliJ
  we are using java 17 ,SpringBoot and Hibernate.


