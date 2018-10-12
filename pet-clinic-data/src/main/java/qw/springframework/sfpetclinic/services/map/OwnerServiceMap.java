package qw.springframework.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import qw.springframework.sfpetclinic.model.Owner;
import qw.springframework.sfpetclinic.model.Pet;
import qw.springframework.sfpetclinic.services.OwnerService;
import qw.springframework.sfpetclinic.services.PetService;
import qw.springframework.sfpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if (object == null) {
            return null;
        }

        if (object.getPets() != null) {
            for (Pet pet : object.getPets()) {
                if (pet.getPetType() == null) {
                    throw new RuntimeException("Pet Type is required.");
                }

                if (pet.getPetType().getId() == null) {
                    pet.setPetType(petTypeService.save(pet.getPetType()));
                }

                if (pet.getId() == null) {
                    petService.save(pet);
                }

            }
        }

        return super.save(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
