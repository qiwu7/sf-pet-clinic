package qw.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.sfpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
