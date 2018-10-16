package qw.springframework.sfpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import qw.springframework.sfpetclinic.model.Specialty;
import qw.springframework.sfpetclinic.model.Vet;
import qw.springframework.sfpetclinic.services.SpecialtyService;
import qw.springframework.sfpetclinic.services.VetService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long>
        implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        for (Specialty s : object.getSpecialties()) {
            if (s.getId() == null) {
                specialtyService.save(s);
            }
        }
        return super.save(object);
    }
}
