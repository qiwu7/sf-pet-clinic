package qw.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.sfpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
