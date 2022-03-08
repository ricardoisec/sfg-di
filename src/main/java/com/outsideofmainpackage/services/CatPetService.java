package com.outsideofmainpackage.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
//@Service // O registo com @Service foi desactivado porque um Bean equivalente foi definido na package 'config'
public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
