package com.brainbytes.petApp.Controllers;

import com.brainbytes.petApp.Entities.Pet;
import com.brainbytes.petApp.Repositories.PetRepository;
import com.brainbytes.petApp.Services.PetService;
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

    private final PetService petService;

    @PostMapping(path = "/pet")
    public Pet AddPet(@RequestBody Pet pet){
        return petService.AddPet(pet);
    }

    @GetMapping(path = "/pets")
    public List<Pet> GetAllPets(){
        return petService.GetAllPets();
    }

    @GetMapping(path = "/pet/{id}")
    public Pet GetPetById(@PathVariable Long id){
        return petService.GetPetById(id);
    }

    @PutMapping(path = "/pet/{id}")
    public Pet UpdatePetById(@PathVariable Long id, @RequestBody Pet petDetails){
        return petService.UpdatePetById(id,petDetails);
    }

    @DeleteMapping(path = "/pet/{id}")
    public void DeletePetById(@PathVariable Long id){
        petService.DeletePetById(id);
    }

}
