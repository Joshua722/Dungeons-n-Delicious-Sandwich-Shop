package com.pluralsight;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class OrderScreen implements CustomerOrder {

    public static DecimalFormat dmt = new DecimalFormat("0.00");
    public static Scanner scanner = new Scanner(System.in);

    public static List<Food> orders = new ArrayList<>();
    public static int count = 1;


    public static void orderScreen() {
        String customerInput = " ";
        while (!customerInput.equalsIgnoreCase("0")) {
            System.out.println("""
                    Evening, Traveler! What do you wanna do?
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    0) Cancel Order 
                    """);
            customerInput = scanner.nextLine().trim();
            switch (customerInput) {

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
                    orderCheckout();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Please choose a valid option.");
                    break;
            }
        }
    }

    public static void orderAdd(String customerInput) {
        switch (customerInput) {
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
                String bread = "";
                switch (breadChoice) {
                    case 1:
                        bread = "White";
                        break;
                    case 2:
                        bread = "Wheat";
                        break;
                    case 3:
                        bread = "Rye";
                        break;
                    case 4:
                        bread = "Wrap";
                        break;
                }

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
                String meat = "";
                switch (meatChoice) {
                    case 1:
                        meat = "Steak";
                        break;
                    case 2:
                        meat = "Ham";
                        break;
                    case 3:
                        meat = "Salami";
                        break;
                    case 4:
                        meat = "Roast Beef";
                        break;
                    case 5:
                        meat = "Chicken";
                        break;
                    case 6:
                        meat = "Bacon";
                        break;
                }

                System.out.println("Would you like to add extra meat to the order? (yes or no) ");
                String extraMeat = scanner.nextLine().trim();
                boolean extraMeatOption = false;
                if (extraMeat.equalsIgnoreCase("yes")) {
                    extraMeatOption = true;
                }

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
                String cheese = "";
                switch (cheeseChoice) {
                    case 1:
                        cheese = "American";
                        break;
                    case 2:
                        cheese = "Provolone";
                        break;
                    case 3:
                        cheese = "Cheddar";
                        break;
                    case 4:
                        cheese = "Swiss";
                        break;
                    case 5:
                        cheese = "No Cheese";
                        break;
                }

                boolean extraCheese = false;
                if (cheeseChoice != 5) {
                    System.out.println("Would you like extra cheese? (yes or no) ");
                    String hasExtra = scanner.nextLine().trim();
                    if (hasExtra.equalsIgnoreCase("yes")) {
                        extraCheese = true;
                    }

                }
                boolean toasted = false;
                System.out.println("Would you like that toasted? (yes or no) ");
                String toastedChoice = scanner.nextLine().trim();
                if (toastedChoice.equalsIgnoreCase("yes")) {
                    toasted = true;
                }
                List<String> toppings = new ArrayList<>();
                toppings.add("Lettuce");
                toppings.add("Peppers");
                toppings.add("Onions");
                toppings.add("Tomatoes");
                toppings.add("Jalepenos");
                toppings.add("Cucumbers");
                toppings.add("Pickles");
                toppings.add("Guacamole");
                toppings.add("Mushrooms");
                toppings.add("None/Next");

                List<String> sandwichToppings = new ArrayList<>();
                int toppingChoice = 0;
                while(toppingChoice != 10) {
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
                            10) None/Next
                            """);
                    toppingChoice = scanner.nextInt();
                    scanner.nextLine();
                    if(toppingChoice > 0 && toppingChoice < toppings.size()){
                        sandwichToppings.add(toppings.get(toppingChoice - 1));
                    }
                }
                List<String> sauces = new ArrayList<>();
                sauces.add("Mayo");
                sauces.add("Mustard");
                sauces.add("Ketchup");
                sauces.add("Ranch");
                sauces.add("Thousand Islands");
                sauces.add("Vinaigrette");
                sauces.add("None/Next");
                int sauceChoice = 0;
                while(sauceChoice!= 7) {
                    System.out.println("""
                            Would you like any sauces?
                            1) Mayo
                            2) Mustard
                            3) Ketchup
                            4) Ranch
                            5) Thousands islands
                            6) Vinaigrette
                            7) None/Next
                            """);
                    sauceChoice = scanner.nextInt();
                    scanner.nextLine();
                    if(sauceChoice > 0 && sauceChoice < sauces.size()){
                        sandwichToppings.add(sauces.get(sauceChoice - 1));
                    }
                }
                List<String> sides = new ArrayList<>();
                sides.add("Au jus");
                sides.add("Sauce");
                sides.add("None");
                int sideChoice = 0;
                while(sideChoice != 3) {
                    System.out.println("""
                            Would you like any sides?
                            1) Au jus (gravy ya buffoon)
                            2) Sauce
                            3) None/Next
                            """);
                    sideChoice = scanner.nextInt();
                    scanner.nextLine();
                    if(sideChoice > 0 && sideChoice < sides.size()){
                        sandwichToppings.add(sides.get(sideChoice - 1));
                    }
                }
                orders.add(new Sandwich(sizeChoice, bread, meat, cheese, sandwichToppings, toasted, extraMeatOption, extraCheese));
                break;

            case "2":
                int drinkChoice = 0;
                    System.out.println("""
                            1) Bubbly Dragon's Blood
                            2) Yellow Snow
                            3) Ogre's Snot Ale
                            4) Dwarf's Honey Mead
                            5) Holy Water
                            6) Glacier Water
                            7) Sorcerer's Power Punch
                            8) Phoenix Tear
                            """);
                    drinkChoice = scanner.nextInt();
                    scanner.nextLine();

                    String drink = "";
                    switch (drinkChoice) {
                        case 1:
                            drink = "Bubbly Dragon's Blood";
                            break;
                        case 2:
                            drink = "Yellow Snow";
                            break;
                        case 3:
                            drink = "Ogre's Snot Ale";
                            break;
                        case 4:
                            drink = "Dwarf's Honey Mead";
                            break;
                        case 5:
                            drink = "Holy Water";
                            break;
                        case 6:
                            drink = "Glacier Water";
                            break;
                        case 7:
                            drink = "Sorcerer's Power Punch";
                            break;
                        case 8:
                            drink = "Phoenix Tear";
                            break;
                        default:
                            System.out.println("Please choose a valid option.");
                            break;
                    }
                    System.out.println("""
                            What size would you like?
                            1) Small
                            2) Medium
                            3) Large
                            """);
                    int size = scanner.nextInt();
                    scanner.nextLine();
                    if (!drink.isEmpty()) {
                        orders.add(new Drinks(size, drink));
                    }

                break;
            case "3":
                int chipsChoice = 0;
                System.out.println("""
                        What chips would you like?
                        1) Sahara Spice Nachos
                        2) Classic
                        3) Ogre Fingers
                        4) Mithral Halls Nachos
                        """);
                chipsChoice = scanner.nextInt();
                scanner.nextLine();
                String chips = "";
                switch (chipsChoice) {
                    case 1:
                        chips = "Sahara Spice Nachos";
                        break;
                    case 2:
                        chips = "Classic";
                        break;
                    case 3:
                        chips = "Ogre Fingers";
                        break;
                    case 4:
                        chips = "Mithral Halls Nachos";
                        break;
                }
                if (!chips.isEmpty()) {
                    orders.add(new Chips(1, chips));
                }
        }
    }


    public static void orderRemove() {

    }

    public static void orderCancel() {

    }



    public static void orderCheckout() throws IOException {
        double totalPrice = 0;
        System.out.println("Whats up doc! Sadly de time has come to taketh thou gold!!!! ");
        for (Food f: orders) {
            System.out.println(f.toString() + " Price: " + dmt.format(f.getPrice()));
            totalPrice += f.getPrice();
        }
        System.out.println("Thou price: " + dmt.format(totalPrice));
        System.out.println("""
                Does everything look to your liking?
                Yay
                Nay
                """);
        String customerInput = scanner.nextLine();
        if (customerInput.charAt(0) == 'Y' || customerInput.charAt(0) == 'y') {
            CustomerReceipt.receiptReader();
        }
    }
}
