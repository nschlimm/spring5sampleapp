package nschlimm.springframework.spring5petclinic.model;

import nschlimm.springframework.spring5petclinic.service.BaseEntity;

public class PetType extends BaseEntity {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
