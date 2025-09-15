package com.brainbytes.petApp.Entities;

import com.brainbytes.petApp.Enums.AppointmentStatus;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;

    private Service service;

    private AppointmentStatus status;

    @ManyToOne
    private List<Pet> pet;
}
