package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergyRepository extends JpaRepository<Allergy, Long> {
}
