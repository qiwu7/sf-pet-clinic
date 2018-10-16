package qw.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.sfpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
