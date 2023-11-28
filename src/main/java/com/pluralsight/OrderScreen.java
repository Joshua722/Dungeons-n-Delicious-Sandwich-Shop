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


    public static void orderScreen() throws IOException {
        String customerInput = " ";
        while (!customerInput.equalsIgnoreCase("0")) {
            System.out.println("""
                    Evening, Traveler! What dost thou wish to undertake?
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    5) Remove Item
                    0) Cancel Order
                    """);
            customerInput = scanner.nextLine().trim();
            switch (customerInput) {

                case "1", "2", "3":
                    orderAdd(customerInput);
                    break;
                case "4":
                    orderCheckout();
                    break;
                case "5":
                    orderRemove();
                    break;
                case "0":
                    orderCancel();
                    break;
                default:
                    System.out.println("Please choose a valid option, if you will.");
                    break;
            }
        }
    }

    public static void orderAdd(String customerInput) {
        switch (customerInput) {
            case "1":
                int sizeChoice = 0;
                while (sizeChoice != 1 && sizeChoice != 2 && sizeChoice != 3) {
                    System.out.println("""
                            In what grand size shall your enchanted sandwich manifest?
                            1) 4"
                            2) 8"
                            3) 12"
                            """);
                    sizeChoice = scanner.nextInt();
                    scanner.nextLine();
                }
                int breadChoice = 0;
                while (breadChoice != 1 && breadChoice != 2 && breadChoice != 3 && breadChoice != 4) {
                    System.out.println("""
                            Of which grain wouldst thou prefer thy bread?
                            1) White
                            2) Wheat
                            3) Rye
                            4) Wrap
                            """);
                    breadChoice = scanner.nextInt();
                    scanner.nextLine();
                }
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
                int meatChoice = 0;
                while (meatChoice < 1 || meatChoice > 6) {
                    System.out.println("""
                            Of what fantastical creature's essence would you partake in your feast?
                            1) Steak
                            2) Ham
                            3) Salami
                            4) Roast beef
                            5) Chicken
                            6) Bacon
                            """);
                    meatChoice = scanner.nextInt();
                    scanner.nextLine();
                }
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

                System.out.println("Shall we enhance thy order with an infusion of extra enchanted meats, noble diner? (yes or no) ");
                String extraMeat = scanner.nextLine().trim();
                boolean extraMeatOption = false;
                if (extraMeat.equalsIgnoreCase("yes")) {
                    extraMeatOption = true;
                }
                int cheeseChoice = 0;
                while (cheeseChoice < 1 || cheeseChoice > 5) {
                    System.out.println("""
                            Of which mystical cheese shall grace thy enchanted banquet?
                            1) American
                            2) Provolone
                            3) Cheddar
                            4) Swiss
                            5) No cheese
                            """);
                    cheeseChoice = scanner.nextInt();
                    scanner.nextLine();
                }
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
                    System.out.println("Wouldst thou desire an additional sprinkling of enchanted cheese upon thy feast? (yes or no) ");
                    String hasExtra = scanner.nextLine().trim();
                    if (hasExtra.equalsIgnoreCase("yes")) {
                        extraCheese = true;
                    }
                }
                boolean toasted = false;
                System.out.println("Wouldst thou prefer thy sustenance imbued with the warmth of dragon's breath, toasted to perfection? (yes or no) ");
                String toastedChoice = scanner.nextLine().trim();
                if (toastedChoice.equalsIgnoreCase("yes")) {
                    toasted = true;
                }
                List<String> toppings = new ArrayList<>();
                toppings.add("Lettuce");
                toppings.add("Peppers");
                toppings.add("Onions");
                toppings.add("Tomatoes");
                toppings.add("Jalapenos");
                toppings.add("Cucumbers");
                toppings.add("Pickles");
                toppings.add("Guacamole");
                toppings.add("Mushrooms");
                toppings.add("None/Next");
                List<String> sandwichToppings = new ArrayList<>();
                int toppingChoice = 0;
                while (toppingChoice != 10) {
                    System.out.println("""
                            Which enchanting adornments shall grace thy culinary creation?
                            1) Lettuce
                            2) Peppers
                            3) Onions
                            4) Tomatoes
                            5) Jalapenos
                            6) Cucumbers
                            7) Pickles
                            8) Guacamole
                            9) Mushrooms
                            10) None/Next
                            """);
                    toppingChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (toppingChoice > 0 && toppingChoice < toppings.size()) {
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
                while (sauceChoice != 7) {
                    System.out.println("""
                            Wouldst thou wish to accompany thy dish with any ambrosial elixirs or enchanted sauces?
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
                    if (sauceChoice > 0 && sauceChoice < sauces.size()) {
                        sandwichToppings.add(sauces.get(sauceChoice - 1));
                    }
                }
                List<String> sides = new ArrayList<>();
                sides.add("Au jus");
                sides.add("Sauce");
                sides.add("None");
                int sideChoice = 0;
                while (sideChoice != 3) {
                    System.out.println("""
                            Pray, wouldst thou desire any mystical accompaniments to complement thy main fare?
                            1) Au jus (gravy ya buffoon)
                            2) Sauce
                            3) None/Next
                            """);
                    sideChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (sideChoice > 0 && sideChoice < sides.size()) {
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
                        System.out.println("I beseech thee to select a valid choice from the enchanted options.");
                        break;
                }
                System.out.println("""
                        In what grand magnitude shall your fantastical creation manifest?
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
                        Of which enchanted crisps wouldst thou partake in thy repast?
                        1) Sahara Spice Fries
                        2) Classical Gold Dipped Elf's Ears
                        3) Ogre Fingers
                        4) Mithril Halls Nachos
                        5) Dwarfish Fried Ale Pickles
                        6) Basilisk Fried Scales
                        """);
                chipsChoice = scanner.nextInt();
                scanner.nextLine();
                String chips = "";
                switch (chipsChoice) {
                    case 1:
                        chips = "Sahara Spice Fries";
                        break;
                    case 2:
                        chips = "Classical Gold Dipped Elf's Ears";
                        break;
                    case 3:
                        chips = "Ogre Fingers";
                        break;
                    case 4:
                        chips = "Mithril Halls Nachos";
                        break;
                    case 5:
                        chips = "Dwarfish Fried Ale Pickles";
                        break;
                    case 6:
                        chips = "Basilisk Fried Scales";
                        break;
                }
                if (!chips.isEmpty()) {
                    orders.add(new Chips(1, chips));
                }
        }
    }


    public static void orderRemove() {
        System.out.println("What ails thy noble feast, that it may not satisfy thy hungering desires? ");
        int count = 1;
        for (Food f : orders) {
            System.out.println(count + ")" + f.toString() + " Price: " + dmt.format(f.getPrice()));
            count++;
        }
        System.out.println("Which item is wrong please choose from the following. ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        if (userChoice > 0 && userChoice < count) {
            orders.remove(userChoice - 1);
            System.out.println("Item has been removed!");
        }
    }

    public static void orderCancel() throws IOException {
        System.out.println("I bid thee return at thy leisure, O Traveler, and indulge once more in the delights of our culinary enchantments!");
        orders.clear();
        Main.main(null);
    }

    public static void orderCheckout() throws IOException {
        double totalPrice = 0;
        System.out.println("Hark! Greetings, esteemed individual! Regrettably, the time hath come to claim thine gold with a heavy heart.");
        for (Food f : orders) {
            System.out.println(f.toString() + " Price: " + dmt.format(f.getPrice()));
            totalPrice += f.getPrice();
        }
        System.out.println("Thou price: " + dmt.format(totalPrice));
        System.out.println("""
                Doth everything appear satisfactory unto thee?
                Yay
                Nay
                """);
        String customerInput = scanner.nextLine();
        if (customerInput.charAt(0) == 'Y' || customerInput.charAt(0) == 'y') {
            System.out.println("Behold! We shall imprint thy receipt upon parchment of the noble dragon's ilk, fresh from our enchanted treasury! ");
            CustomerReceipt.receiptReader(orders, totalPrice);
            System.out.println("Pray, retrieve thy receipt at the threshold, where our diligent Dwarven artisan awaits to deliver it unto thee! May thy evening be filled with grandeur! ");
            orders.clear();
            Main.main(null);
        }
    }
}
