package qw.springframework.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import qw.springframework.sfpetclinic.model.Pet;
import qw.springframework.sfpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long>
        implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }
}