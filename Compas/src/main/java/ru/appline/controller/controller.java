package ru.appline.controller;


import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.appline.logic.CompasModel;
import ru.appline.logic.Sides;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*

Content-Type: application/json
{
    "North": "338-23",
    "North_East": "24-69",
    "East":  "70-115",
    "South_East":"116-151",
    "South": "152-197",
    "South_West":"197-242",
    "West": "243-248",
    "North_West":"293-337"
}

 */



@RestController
public class controller {
        private static final CompasModel compasModel = CompasModel.getInstance();



        @PostMapping(value="/set", consumes="application/json")
        public void put(@RequestBody Sides side, Integer degree)
        {
                compasModel.add(side,degree);
        }

        @GetMapping(value="/get")
        public Map<Sides, Integer> get()
        {
                return compasModel.getFromList();
        }

        @GetMapping(value="/getone", consumes="application/json", produces="application/json")
        public int oneOf(@RequestBody int id)
        {
              
        }

//        @PostMapping(value="/set", consumes="application/json")
//        public void put(@RequestBody Sides side, String degree)
//        {
//                compasModel.add(side,degree);
//        }
//
//        @GetMapping(value="/get")
//        public Map<Sides, String> get()
//        {
//                return compasModel.getFromList();
//        }

}