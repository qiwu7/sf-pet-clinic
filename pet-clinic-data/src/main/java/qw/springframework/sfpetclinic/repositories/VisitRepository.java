package qw.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.sfpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
