package qw.springframework.sfpetclinic.services;

import qw.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
