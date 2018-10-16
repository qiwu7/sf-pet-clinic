package qw.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.sfpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
