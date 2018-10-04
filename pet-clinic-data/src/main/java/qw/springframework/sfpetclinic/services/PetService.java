package qw.springframework.sfpetclinic.services;

import qw.springframework.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
