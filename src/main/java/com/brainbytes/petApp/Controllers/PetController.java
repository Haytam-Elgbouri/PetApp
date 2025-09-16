package com.brainbytes.petApp.Controllers;

import com.brainbytes.petApp.Entities.Pet;
import com.brainbytes.petApp.Repositories.PetRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
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


}
