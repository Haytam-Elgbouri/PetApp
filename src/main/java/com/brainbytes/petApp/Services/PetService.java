package com.brainbytes.petApp.Services;

import com.brainbytes.petApp.Entities.Pet;

import java.util.List;

public interface PetService {
   Pet AddPet(Pet pet);
   List<Pet>  GetAllPets();
   Pet  GetPetById(Long id);
   Pet  UpdatePetById(Long id, Pet pet);
   void  DeletePetById(Long id);
}
