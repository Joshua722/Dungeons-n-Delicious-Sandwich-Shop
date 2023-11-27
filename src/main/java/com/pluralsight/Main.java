package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endOrder = "0";

        while (endOrder.equals("0")) {
            System.out.println("Welcome to Dungeons n Delicious Sandwich Shop\n" +
                    "1) New Order\n" +
                    "0) Exit\n");
            endOrder = scanner.nextLine();

            switch (endOrder) {
                case "1":
                    OrderScreen.orderScreen();
                case "0": {
                    System.exit(0);
                }
                default:
                    System.out.println("Try again traveler");
            }

        }
    }
}

