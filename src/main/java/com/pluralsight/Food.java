package com.pluralsight;

public abstract class Food {
    private int size;

    public Food(int size) {
        this.size = size;
    }

    public double getPrice() {
        return 0.0;
    }

    public String getSize() {
        switch(size){
            case 1:
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            default:
                return "";
        }
    }

    public void setSize(int size) {
        this.size = size;
    }
}
