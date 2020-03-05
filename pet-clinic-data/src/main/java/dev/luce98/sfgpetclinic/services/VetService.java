package dev.luce98.sfgpetclinic.services;

import dev.luce98.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();

}
