package com.healthProject.Repository;

import com.healthProject.entity.MedicationReminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationReminderRepository extends JpaRepository<MedicationReminder,Long> {
}
