package com.brainbytes.petApp.Controllers;

import com.brainbytes.petApp.Entities.Pet;
import com.brainbytes.petApp.Repositories.PetRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
@Data
public class PetController {

    private final PetRepository petRepository;

    @PostMapping(path = "/pet")
    public Pet AddPet(@RequestBody Pet pet){
        return petRepository.save(pet);
    }


    @GetMapping(path = "/pets")
    public List<Pet> GetAllPets(){
        return petRepository.findAll();
    }

    @GetMapping(path = "/pet/{id}")
    public Pet GetPetById(@PathVariable Long id){
        return petRepository.findById(id).orElse(null);
    }

    @PutMapping(path = "/pet/{id}")
    public Pet UpdatePetById(@PathVariable Long id, @RequestBody Pet petDetails){
        return petRepository.findById(id).map(pet ->{
            pet.setAge(petDetails.getAge());
            pet.setColor(petDetails.getColor());
            pet.setGender(petDetails.getGender());
            pet.setWeight(petDetails.getWeight());
            pet.setVaccinationStatus(petDetails.getVaccinationStatus());
            pet.setNote(petDetails.getNote());
            pet.setAllergy(petDetails.getAllergy());
            pet.setMedicalHistory(petDetails.getMedicalHistory());
            return petRepository.save(pet);
        }).orElse(null);
    }

    @DeleteMapping(path = "/pet/{id}")
    public void DeletePetById(@PathVariable Long id){
        petRepository.deleteById(id);
    }

}
