package ru.appline.logic;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompasModel implements Serializable {
 private static final CompasModel instance = new CompasModel();


    private final Map<Sides,Integer> model;

    public static CompasModel getInstance() {
        return instance;
    }
    public CompasModel(){model=new HashMap<Sides, Integer>();}

    public void add(Sides side,Integer degree)
    {
        model.put(side, degree);
    }

    public Map<Sides, Integer> getFromList()
    {
        return model;
    }

    public int getOne(int id)
    {
        return model.get(id);
    }

// private final Map<Sides,String> model;
//
//    public static CompasModel getInstance() {
//        return instance;
//    }
//    public CompasModel(){model=new HashMap<Sides, String>();}
//
//    public void add(Sides side,String degree)
//    {
//        model.put(side, degree);
//    }
//
//    public Map<Sides, String> getFromList()
//    {
//        return model;
//    }

}
