package com.outsideofmainpackage.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
//@Service // O registo com @Service foi desactivado porque um Bean equivalente foi definido na package 'config'
public class DogPetService implements PetService {

    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
