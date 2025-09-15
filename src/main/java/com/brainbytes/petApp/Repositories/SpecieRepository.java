package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Specie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecieRepository extends JpaRepository<Specie, Long> {
}
