package com.mapura.apiRest.PaquetePersona;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private PersonRepository personRepo;

    public void createPerson(Person person){
    personRepo.save(person);
    }



}
