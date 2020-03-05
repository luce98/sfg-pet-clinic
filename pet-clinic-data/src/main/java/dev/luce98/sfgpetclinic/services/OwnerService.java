package dev.luce98.sfgpetclinic.services;

import dev.luce98.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
