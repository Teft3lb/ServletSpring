package ru.appline.controller;


import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Pet;
import ru.appline.logic.PetModel;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class controller {
    private static final PetModel petModel = PetModel.getInstance();
    private static final AtomicInteger newId = new AtomicInteger(1);

    @PutMapping(value="/put", consumes="application/json")
    public void put(@RequestBody Pet pet, int id)
    {
        petModel.put(pet,id);
    }

    @DeleteMapping(value="/deletepet")
    public void delete(int id)
    {
        petModel.deletePet(id);
    }


     /*
    {
        "name": "KOKO",
        "type": "Chik",
        "age": "2"
    }
     */

    @PostMapping(value = "/createpet", consumes = "application/json")
    public void createPet(@RequestBody Pet pet)
    {
        petModel.add(pet, newId.getAndIncrement());
    }

    @GetMapping(value = "/getall", produces = "application/json")
    public Map<Integer, Pet> getAll()
    {
        return petModel.getAll();
    }

    /*
    {
        "id": 3
    }
     */

   @GetMapping(value ="/getpet", consumes="application/json", produces= "application/json")
    public Pet getPet(@RequestBody Map<String, Integer> id)
   {
       return petModel.getFromList(id.get("id"));
   }

}
