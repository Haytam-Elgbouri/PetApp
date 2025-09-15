package com.brainbytes.petApp.Entities;

import com.brainbytes.petApp.Enums.VaccinationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Specie specie;

    private String gender;

    private Long age;

    private Long weight;

    private String color;

    private List<Allergy> allergy;

    private VaccinationStatus vaccinationStatus;

    private Date lastVisited;

    private Date registerDate;

    private String note;

    private String medicalHistory;

    @ManyToOne
    private Client owner;
}
