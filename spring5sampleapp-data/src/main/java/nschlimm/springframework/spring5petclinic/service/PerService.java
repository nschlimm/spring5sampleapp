package nschlimm.springframework.spring5petclinic.service;

import nschlimm.springframework.spring5petclinic.model.Owner;
import nschlimm.springframework.spring5petclinic.model.Pet;

public interface PerService {

    Pet findByLastName(String lastName);
    Pet findById(Long id);
    Pet save(Owner owner);

}
