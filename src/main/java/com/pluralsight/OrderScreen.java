package com.pluralsight;

import java.util.Scanner;

public class OrderScreen implements CustomerOrder {

    public static Scanner scanner = new Scanner(System.in);


    public void orderScreen() {
        System.out.println("""
      Evening, Traveler! What do you wanna do?
      1) Add Sandwich
      2) Add Drink
      3) Add Chips
      4) Checkout
      0) Cancel Order 
      """);
        String customerInput = scanner.nextLine();
        switch (customerInput){
            case "1":
                orderAdd(customerInput);
                break;
            case "2":
                orderAdd(customerInput);
                break;
            case "3":
                orderAdd(customerInput);
                break;
            case "4":
                orderDisplay();
                break;
            case "0":
                break;
            default:
                System.out.println("Please choose a valid option.");
                break;
        }

    }

    @Override
    public void orderAdd() {

    }

    @Override
    public void orderRemove() {

    }

    @Override
    public void orderCancel() {

    }

    @Override
    public void orderDisplay() {

    }

    @Override
    public void orderTotal() {

    }

    @Override
    public void orderCheckout() {

    }
}
