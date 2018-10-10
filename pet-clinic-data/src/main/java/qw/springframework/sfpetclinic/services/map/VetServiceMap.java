package qw.springframework.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import qw.springframework.sfpetclinic.model.Vet;
import qw.springframework.sfpetclinic.services.CrudService;
import qw.springframework.sfpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
