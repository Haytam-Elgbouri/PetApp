package com.brainbytes.petApp.DTOs;

import com.brainbytes.petApp.Entities.Allergy;
import com.brainbytes.petApp.Entities.Client;
import com.brainbytes.petApp.Entities.Specie;
import com.brainbytes.petApp.Enums.VaccinationStatus;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PetDTO {
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
    private Client owner;
}
