package ru.appline.logic;

public class Sides {
        private String Sidedirection;
        private String degree;

    public Sides(String sidedirection, String degree) {
        this.Sidedirection = sidedirection;
        this.degree = degree;
    }

    public Sides() {
    }

    public String getSidedirection() {
        return Sidedirection;
    }

    public void setSidedirection(String sidedirection) {
        Sidedirection = sidedirection;
    }
}
