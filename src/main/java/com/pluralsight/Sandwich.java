package com.pluralsight;

import java.util.*;

public class Sandwich extends Food {
    private String bread, meat, cheese;
    private List<String> toppings;
    private boolean toasted, extraMeat, extraCheese;

    public Sandwich(int size, String bread, String meat, String cheese, List<String> toppings, boolean toasted, boolean extraMeat, boolean extraCheese) {
        super(size);
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.toasted = toasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String toString() {
        StringBuilder sandwich = new StringBuilder();
        sandwich.append("Sandwich: \n");
        sandwich.append(bread + "\n" + meat + "\n" + cheese);
        for (String s : toppings) {
            sandwich.append("\n" + s);
        }
        if (toasted) {
            sandwich.append("\nToasted");
        }
        return sandwich.toString();
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        switch (getSize()) {
            case "Small":
                price += 5.50;
                break;
            case "Medium":
                price += 7.00;
                break;
            case "Large":
                price += 8.50;
                break;
        }
        if (!meat.isEmpty()) {
            switch (getSize()) {
                case "Small":
                    price += 1.00;
                    break;
                case "Medium":
                    price += 2.00;
                    break;
                case "Large":
                    price += 3.00;
                    break;
            }
            if (extraMeat) {
                switch (getSize()) {
                    case "Small":
                        price += 0.50;
                        break;
                    case "Medium":
                        price += 1.00;
                        break;
                    case "Large":
                        price += 1.50;
                        break;
                }
            }
        }
        if (!cheese.isEmpty()) {
            switch (getSize()) {
                case "Small":
                    price += 0.75;
                    break;
                case "Medium":
                    price += 1.50;
                    break;
                case "Large":
                    price += 2.25;
                    break;
            }
            if (extraCheese) {
                switch (getSize()) {
                    case "Small":
                        price += 0.30;
                        break;
                    case "Medium":
                        price += 0.60;
                        break;
                    case "Large":
                        price += 0.90;
                        break;
                }
            }
        }
        return price;
    }
}