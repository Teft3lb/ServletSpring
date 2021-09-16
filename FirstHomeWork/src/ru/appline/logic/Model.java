package ru.appline.logic;



import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable
{
    private static final Model instance = new Model();

    private final Map<Integer, User> model;

    public static Model getInstance()
    {
        return instance;
    }

    private Model()
    {
        model = new HashMap<>();
        model.put(1, new User("First", "UserfirstSur", 1233231));
        model.put(2, new User("Second", "UsersecSur", 55342));
        model.put(3, new User("Third", "UserthirdSur", 35743));
    }
    public void delete(int id)
    {
        model.keySet().removeIf(key->id !=1);
    }
    public void put(User user,int id){ model.replace(id,user);}
    public void add(User user, int id)
    {
        model.put(id, user);
    }

    public Map<Integer, User> getFromList()
    {
        return model;
    }


}