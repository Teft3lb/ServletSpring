package ru.appline.controller;


import org.springframework.web.bind.annotation.*;
import ru.appline.logic.CompasModel;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*

Content-Type: application/json
{
    "North": "338-23",
    "North_East": "24-69"
    "East":  "70-115",
    "South_East":"116-151"
    "South": "152-197",
    "South_West":"197-242"
    "West": "243-248"
    "North_West":"293-337"
}

 */



@RestController
public class controller {

    private static final CompasModel compasModel = CompasModel.getInstance();
    private static final AtomicInteger newId = new AtomicInteger(1);


    @PostMapping(value="/set", consumes="application/json")
    public void set(@RequestBody String bufer){
        compasModel.add(bufer);
    }


    @GetMapping(value="/get")
    public String get()
    {
        return compasModel.get();
    }
    @GetMapping(value="/getall", produces="application/json")
    public ArrayList getall()
    {
        return compasModel.getall();
    }
}