package com.brainbytes.petApp.Services.Implementations;

import com.brainbytes.petApp.Entities.Pet;
import com.brainbytes.petApp.Repositories.PetRepository;
import com.brainbytes.petApp.Services.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Override
    public Pet AddPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public List<Pet> GetAllPets() {
        return petRepository.findAll();
    }

    @Override
    public Pet GetPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet UpdatePetById(Long id, Pet petDetails) {
        return petRepository.findById(id).map(pet -> {
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

    @Override
    public void DeletePetById(Long id) {
        petRepository.deleteById(id);
    }
}
