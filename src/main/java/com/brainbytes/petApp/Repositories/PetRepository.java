package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
