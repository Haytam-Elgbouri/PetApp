package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepositry extends JpaRepository<Pet, Long> {
}
