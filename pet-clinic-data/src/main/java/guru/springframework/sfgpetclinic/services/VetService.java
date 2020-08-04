package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.*;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet  vet);

    Set<Vet> findAll();
}
