package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String endOrder = "";

        while (!endOrder.equals("0")) {
            System.out.println("""
                    Welcome to Dungeons n Delicious Sandwich Shop
                    1) New Order
                    0) Exit""");
            endOrder = scanner.nextLine();

            switch (endOrder) {
                case "1":
                    OrderScreen.orderScreen();
                    break;
                case "0": {
                    System.exit(0);
                }
                default:
                    System.out.println("Try again traveler");
                    break;
            }

        }
    }
}

