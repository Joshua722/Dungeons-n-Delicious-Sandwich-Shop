package com.pluralsight;

public class Chips extends Food{
    private String flavor;

    public Chips(int size, String flavor) {
        super(size);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chips: " + flavor;
    }
    @Override
    public double getPrice(){
        return 1.50;
    }
}
