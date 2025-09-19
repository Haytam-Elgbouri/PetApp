package com.brainbytes.petApp.Mappers;

import com.brainbytes.petApp.DTOs.PetDTO;
import com.brainbytes.petApp.Entities.Pet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetMapper {

    PetDTO toDto(Pet pet);

    Pet toEntity(PetDTO petDTO);
}
