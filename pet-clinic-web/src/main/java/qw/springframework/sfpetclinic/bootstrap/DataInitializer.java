package qw.springframework.sfpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import qw.springframework.sfpetclinic.model.Owner;
import qw.springframework.sfpetclinic.model.PetType;
import qw.springframework.sfpetclinic.model.Vet;
import qw.springframework.sfpetclinic.services.OwnerService;
import qw.springframework.sfpetclinic.services.PetTypeService;
import qw.springframework.sfpetclinic.services.VetService;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType("dog");
        PetType savedDogPetType = petTypeService.save(dog);


        PetType cat = new PetType("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");

        ownerService.save(owner2);

        System.out.println("Loading owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Jake");
        vet3.setLastName("Parker");

        vetService.save(vet3);

        System.out.println("Loading vets");

        System.out.println(ownerService.findAll().size());
    }
}
