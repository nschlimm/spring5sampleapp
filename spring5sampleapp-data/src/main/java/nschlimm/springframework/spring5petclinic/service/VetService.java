package nschlimm.springframework.spring5petclinic.service;

import nschlimm.springframework.spring5petclinic.model.Owner;

public interface VetService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

}
