package dev.luce98.sfgpetclinic.bootstrap;

import dev.luce98.sfgpetclinic.model.Owner;
import dev.luce98.sfgpetclinic.model.Vet;
import dev.luce98.sfgpetclinic.services.OwnerService;
import dev.luce98.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Pam");
        owner2.setLastName("Beesley");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Dwight");
        vet1.setLastName("Schrute");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Angela");
        vet2.setLastName("Martin");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }

}
