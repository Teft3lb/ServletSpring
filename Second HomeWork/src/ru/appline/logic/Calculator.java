package ru.appline.logic;

import java.io.Serializable;

public class Calculator implements Serializable {

    private static final Calculator instance = new Calculator();
    public static Calculator getInstance(){return instance;}

    public int sum(int a, int b)
    {
        return a+b;
    }
    public int subtraction (int a, int b)
    {
        return a-b;
    }
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    public int division( int a, int b) { return a/b; }
}
