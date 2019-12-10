package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    //private final PetService petService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        //petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loaded Owner");
        System.out.println("Loaded Vet");
    }
}
