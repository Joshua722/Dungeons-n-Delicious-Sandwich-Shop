package com.pluralsight;

//Co-written by Paul and Jake
public class Drinks extends Food {
    private String flavor;

    public Drinks(int size, String flavor) {
        super(size);
        this.flavor = flavor;
    }


    @Override
    public String toString() {
        return "Drink size: " + this.getSize() + " Flavor: " + flavor;
    }

    @Override
    public double getPrice() {
        switch (getSize()) {
            case "Small":
                return 2.00;
            case "Medium":
                return 2.50;
            case "Large":
                return 3.00;
            default:
                return 0.0;
        }
    }
}
