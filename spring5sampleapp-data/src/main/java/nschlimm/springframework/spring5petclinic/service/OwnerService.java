package nschlimm.springframework.spring5petclinic.service;

import java.util.Set;

import nschlimm.springframework.spring5petclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    
}
