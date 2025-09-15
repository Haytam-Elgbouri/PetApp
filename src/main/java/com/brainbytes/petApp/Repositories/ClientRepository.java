package com.brainbytes.petApp.Repositories;

import com.brainbytes.petApp.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
