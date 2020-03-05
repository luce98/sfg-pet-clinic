package dev.luce98.sfgpetclinic.services;

import dev.luce98.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner fidnById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
