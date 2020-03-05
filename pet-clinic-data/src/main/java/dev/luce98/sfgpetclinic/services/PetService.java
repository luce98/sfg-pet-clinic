package dev.luce98.sfgpetclinic.services;

import dev.luce98.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();

}
