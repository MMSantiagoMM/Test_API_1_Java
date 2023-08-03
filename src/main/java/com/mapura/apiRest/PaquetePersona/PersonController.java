package com.mapura.apiRest.PaquetePersona;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person",method = RequestMethod.GET)
@RequiredArgsConstructor
public class PersonController {
    private PersonService personService;

    @PostMapping
    public void createPersona(@RequestBody Person person){
        personService.createPerson(person);
    }
}
