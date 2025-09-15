package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
