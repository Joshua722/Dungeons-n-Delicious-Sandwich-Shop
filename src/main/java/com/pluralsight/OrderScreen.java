package com.pluralsight;

import java.util.Scanner;

public class OrderScreen implements CustomerOrder {

    public static Scanner scanner = new Scanner(System.in);


    public static void orderScreen() {
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


    public static void orderAdd(String customerInput) {
        switch (customerInput){
            case "1":
                System.out.println("""
                        How big do you want your sandwich?
                        1) 4"
                        2) 8"
                        3) 12"
                        """);
                int sizeChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("""
                        What type of bread would you like?
                        1) White
                        2) Wheat
                        3) Rye
                        4) Wrap
                        """);
                int breadChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("""
                        What type of meat do you want?
                        1) Steak
                        2) Ham
                        3) Salami
                        4) Roast beef
                        5) Chicken
                        6) Bacon
                        """);
                int meatChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Would you like to add extra meat to the order? (yes or no) ");
                String extraMeat = scanner.nextLine().trim();

                System.out.println("""
                        What type of cheese would you like?
                        1) American
                        2) Provolone
                        3) Cheddar
                        4) Swiss
                        5) No cheese
                        """);
                int cheeseChoice = scanner.nextInt();
                scanner.nextLine();

                boolean extraCheese = false;
                if (cheeseChoice != 5) {
                    System.out.println("Would you like extra cheese? (yes or no) ");
                    String hasExtra = scanner.nextLine().trim();
                    if (hasExtra.equalsIgnoreCase("yes")) {
                        extraCheese = true;
                    }

                }

                System.out.println("""
                        What toppings would you like?
                        1) Lettuce
                        2) Peppers
                        3) Onions
                        4) Tomatoes
                        5) Jalepenos
                        6) Cucumbers
                        7) Pickles
                        8) Guacamole
                        9) Mushrooms
                        """);
                int toppingChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("""
                        Would you like any sauces?
                        1) Mayo
                        2) Mustard
                        3) Ketchup
                        4) Ranch
                        5) Thousands islands
                        6) Vinaigrette
                        """);
                int sauceChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.println("""
                        Would you like any sides?
                        1) Au jus (gravy ya buffoon)
                        2) Sauce
                        """);
                int sideChoice = scanner.nextInt();
                scanner.nextLine();

            case "2":
                System.out.println("""
                        Would you like a drink to your order?
                        
                        """);
        }
    }


    public static void orderRemove() {

    }

    public static void orderCancel() {

    }

    public static void orderDisplay() {

    }

    public static void orderTotal() {

    }

    public static void orderCheckout() {

    }
}
