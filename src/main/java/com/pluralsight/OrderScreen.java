package com.pluralsight;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class OrderScreen implements CustomerOrder {
    //created static variables to be used within this class
    public static DecimalFormat dmt = new DecimalFormat("0.00");
    public static Scanner scanner = new Scanner(System.in);

    public static List<Food> orders = new ArrayList<>();


    public static void orderScreen() throws IOException {
        String customerInput = " ";
        //This will include our menu options
        while (!customerInput.equalsIgnoreCase("0")) {
            System.out.println("""
                    Evening, Traveler! What dost thou wish to undertake?
                    1) Add Sandwich
                    2) Add Drink
                    3) Add Chips
                    4) Checkout
                    5) Remove Item
                    6) Roll-A-Sandwich
                    7) Roll-A-Meal
                    0) Cancel Order
                    """);
            customerInput = scanner.nextLine().trim();
            switch (customerInput) {
                //instead of having multiple lines of cases we condensed into one that call same method
                case "1", "2", "3":
                    orderAdd(customerInput);
                    break;
                case "4":
                    orderCheckout();
                    break;
                case "5":
                    if (!orders.isEmpty()) {
                        orderRemove();
                    } else {
                        System.out.println("Hark! Thy order awaits, yet unspoken. Choose from our menu of medieval wonders, and our artisans shall swiftly weave a feast fit for nobility.");
                    }
                    break;
                case "6":
                    rollASandwich();
                    break;
                case "7":
                    rollAMeal();
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
        //we grab userInput from above to determine which item they are adding
        //case 1 sandwich
        //case 2 drink
        //case 3 chips
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
                            1) Dragon's Ember Barley
                            2) Moonstone Wheat
                            3) Celestial Millet
                            4) Mermaid's Seagrass
                            """);
                    breadChoice = scanner.nextInt();
                    scanner.nextLine(); //consume line after int
                }
                String bread = "";
                //grabs userInput from above question and stores into variable then passes through series of cases
                switch (breadChoice) {
                    case 1:
                        bread = "Dragon's Ember Barley";
                        break;
                    case 2:
                        bread = "Moonstone Wheat";
                        break;
                    case 3:
                        bread = "Celestial Millet";
                        break;
                    case 4:
                        bread = "Mermaid's Seagrass";
                        break;
                }
                int meatChoice = 0;
                while (meatChoice < 1 || meatChoice > 6) {
                    System.out.println("""
                            Of what fantastical creature's essence would you partake in your feast?
                            1) Griffin's Roast
                            2) Dragonfire Sausages
                            3) Unicorn Tenderloin
                            4) Kraken Calamari
                            5) Troll Tender
                            6) Gorgon Charcuterie
                            """);
                    meatChoice = scanner.nextInt();
                    scanner.nextLine();
                }
                String meat = "";
                //grabs userInput from above question and stores into variable then passes through series of cases
                switch (meatChoice) {
                    case 1:
                        meat = "Griffin's Roast";
                        break;
                    case 2:
                        meat = "Dragonfire Sausages";
                        break;
                    case 3:
                        meat = "Unicorn Tenderloin";
                        break;
                    case 4:
                        meat = "Kraken Calamari";
                        break;
                    case 5:
                        meat = "Troll Tender";
                        break;
                    case 6:
                        meat = "Gorgon Charcuterie";
                        break;
                }

                System.out.println("Shall we enhance thy order with an infusion of extra enchanted meats, noble diner? (yes or no) ");
                String extraMeat = scanner.nextLine().trim();
                //asking user if they want extra meat and pre-setting a boolean to false and if they say yes we changed to true
                boolean extraMeatOption = false;
                if (extraMeat.equalsIgnoreCase("yes")) {
                    extraMeatOption = true;
                }
                int cheeseChoice = 0;
                //grabs userInput from above question and stores into variable then passes through series of cases
                while (cheeseChoice < 1 || cheeseChoice > 5) {
                    System.out.println("""
                            Of which mystical cheese shall grace thy enchanted banquet?
                            1) Wyrmwood Cheddar
                            2) Goblin Blue
                            3) Elven Moon Cheese
                            4) Dwarven Forge Gruyère
                            5) No cheese
                            """);
                    cheeseChoice = scanner.nextInt();
                    scanner.nextLine();
                }
                String cheese = "";
                //grabs userInput from above question and stores into variable then passes through series of cases
                switch (cheeseChoice) {
                    case 1:
                        cheese = "Wyrmwood Cheddar";
                        break;
                    case 2:
                        cheese = "Goblin Blue";
                        break;
                    case 3:
                        cheese = "Elven Moon Cheese";
                        break;
                    case 4:
                        cheese = "Dwarven Forge Gruyère";
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
                toppings.add("Centaur-Smoked Tomatoes");
                toppings.add("Mystic Mushroom Medley");
                toppings.add("Dragonfruit Slices");
                toppings.add("Enchanted Herb Butter Lettuce");
                toppings.add("Banshee's Bitter Arugula");
                toppings.add("Siren's Sea Salted Cucumbers");
                toppings.add("Unicorn-Roasted Red Pepper Strips");
                toppings.add("Guacamole");
                toppings.add("Goblin Pickled Peppers");
                toppings.add("None/Next");
                List<String> sandwichToppings = new ArrayList<>();
                int toppingChoice = 0;
                while (toppingChoice != 10) {
                    System.out.println("""
                            Which enchanting adornments shall grace thy culinary creation?
                            1) Centaur-Smoked Tomatoes
                            2) Mystic Mushroom Medley
                            3) Dragonfruit Slices
                            4) Enchanted Herb Butter Lettuce
                            5) Banshee's Bitter Arugula
                            6) Siren's Sea Salted Cucumbers
                            7) Unicorn-Roasted Red Pepper Strips
                            8) Guacamole
                            9) Goblin Pickled Peppers
                            10) None/Next
                            """);
                    toppingChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (toppingChoice > 0 && toppingChoice < toppings.size()) {
                        sandwichToppings.add(toppings.get(toppingChoice - 1));
                    }
                }
                //list of our fantasy sauces
                List<String> sauces = new ArrayList<>();
                sauces.add("Dragon's Breath Sriracha Mayo");
                sauces.add("Mermaid's Seaweed Pesto");
                sauces.add("Enchanted Basilisk Aioli");
                sauces.add("Chimera Roasted Red Pepper Hummus");
                sauces.add("Thousand Islands");
                sauces.add("Vinaigrette");
                sauces.add("None/Next");
                int sauceChoice = 0;
                //prompts user for the sauce that they want
                while (sauceChoice != 7) {
                    System.out.println("""
                            Wouldst thou wish to accompany thy dish with any ambrosial elixirs or enchanted sauces?
                            1) Dragon's Breath Sriracha Mayo
                            2) Mermaid's Seaweed Pesto
                            3) Enchanted Basilisk Aioli
                            4) Chimera Roasted Red Pepper Hummus
                            5) Thousands islands
                            6) Vinaigrette
                            7) None/Next
                            """);
                    sauceChoice = scanner.nextInt();
                    scanner.nextLine();
                    //have to do -1 because of options not lining up with list index
                    if (sauceChoice > 0 && sauceChoice < sauces.size()) {
                        sandwichToppings.add(sauces.get(sauceChoice - 1));
                    }
                }
                List<String> sides = new ArrayList<>();
                sides.add("Elf-Kissed Quinoa Pilaf");
                sides.add("Harpy's Herb-infused Rice");
                sides.add("None");
                int sideChoice = 0;
                while (sideChoice != 3) {
                    System.out.println("""
                            Pray, wouldst thou desire any mystical accompaniments to complement thy main fare?
                            1) Elf-Kissed Quinoa Pilaf
                            2) Harpy's Herb-infused Rice
                            3) None/Next
                            """);
                    sideChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (sideChoice > 0 && sideChoice < sides.size()) {
                        sandwichToppings.add(sides.get(sideChoice - 1));
                    }
                }
                //after all sandwich items have been record we will add to our orders list that was created at the top
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
                //if drink is chosen then it will be added to list
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
                //if chips are chosen then it will add it to list
                if (!chips.isEmpty()) {
                    orders.add(new Chips(1, chips));
                }
        }
    }


    public static void orderRemove() {
        System.out.println("What ails thy noble feast, that it may not satisfy thy hungering desires? ");
        int count = 1;
        //for every food item in the orders list it will print with our toString method
        //we added a count to differentiate between each food item and make it easier for user to select an item
        for (Food f : orders) {
            System.out.println(count + ")" + f.toString() + " Price: " + dmt.format(f.getPrice()));
            count++;
        }
        //will ask user for item that is wrong and remove from the existing list
        System.out.println("Which item is wrong please choose from the following. ");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        if (userChoice > 0 && userChoice < count) {
            orders.remove(userChoice - 1);
            System.out.println("Item has been removed!");
        }
    }

    public static void orderCancel() throws IOException {
        //we clear out the order's list
        System.out.println("I bid thee return at thy leisure, O Traveler, and indulge once more in the delights of our culinary enchantments!");
        orders.clear();
        //calling main passing through the arg parameter with null
        Main.main(null);
    }

    public static void orderCheckout() throws IOException {
        double totalPrice = 0;
        System.out.println("Hark! Greetings, esteemed individual! Regrettably, the time hath come to claim thine gold with a heavy heart.");
        //for every food item in the orders list it will print with our toString method
        for (Food f : orders) {
            System.out.println(f.toString() + "\nPrice: " + dmt.format(f.getPrice()));
            totalPrice += f.getPrice();
        }
        System.out.println("Thou Total Price: " + dmt.format(totalPrice));
        System.out.println("""
                Doth everything appear satisfactory unto thee?
                Yay
                Nay
                """);
        String customerInput = scanner.nextLine();
        //we used charAt in case user wants to type yes yeah ye or anything along those lines
        if (customerInput.charAt(0) == 'Y' || customerInput.charAt(0) == 'y') {
            System.out.println("Behold! We shall imprint thy receipt upon parchment of the noble dragon's ilk, fresh from our enchanted treasury! ");
            //call our receipt printing method and store receipt in a folder with the local date & time as file name
            CustomerReceipt.receiptReader(orders, totalPrice);
            System.out.println("Pray, retrieve thy receipt at the threshold, where our diligent Dwarven artisan awaits to deliver it unto thee! May thy evening be filled with grandeur! ");
            //after we print receipt we start with a fresh list to accept new orders
            orders.clear();
            Main.main(null);
        }
    }

    public static void rollASandwich() {
        //EXTRA WORK
        //In this method we randomly generate you a funky sandwich
        int sizeChoice = 0;
        while (sizeChoice != 1 && sizeChoice != 2 && sizeChoice != 3) {
            System.out.println("""
                    How big do you want your sandwich?
                    1) 4"
                    2) 8"
                    3) 12"
                    """);
            sizeChoice = scanner.nextInt();
            scanner.nextLine();
        }
        //multiply by our range and then we add one to get our min
        int meatChoice = (int) (Math.random() * 6) + 1;
        int breadChoice = (int) (Math.random() * 4) + 1;
        int cheeseChoice = (int) (Math.random() * 4) + 1;
        String bread = "";
        String meat = "";
        String cheese = "";
        switch (breadChoice) {
            case 1:
                bread = "Dragon's Ember Barley";
                break;
            case 2:
                bread = "Moonstone Wheat";
                break;
            case 3:
                bread = "Celestial Millet";
                break;
            case 4:
                bread = "Mermaid's Seagrass";
                break;
        }
        switch (meatChoice) {
            case 1:
                meat = "Griffin's Roast";
                break;
            case 2:
                meat = "Dragonfire Sausages";
                break;
            case 3:
                meat = "Unicorn Tenderloin";
                break;
            case 4:
                meat = "Kraken Calamari";
                break;
            case 5:
                meat = "Troll Tender";
                break;
            case 6:
                meat = "Gorgon Charcuterie";
                break;
        }
        switch (cheeseChoice) {
            case 1:
                cheese = "Wyrmwood Cheddar";
                break;
            case 2:
                cheese = "Goblin Blue";
                break;
            case 3:
                cheese = "Elven Moon Cheese";
                break;
            case 4:
                cheese = "Dwarven Forge Gruyère";
                break;
            case 5:
                cheese = "No Cheese";
                break;
        }
        List<String> toppings = new ArrayList<>();
        toppings.add("Centaur-Smoked Tomatoes");
        toppings.add("Mystic Mushroom Medley");
        toppings.add("Dragonfruit Slices");
        toppings.add("Enchanted Herb Butter Lettuce");
        toppings.add("Banshee's Bitter Arugula");
        toppings.add("Siren's Sea Salted Cucumbers");
        toppings.add("Unicorn-Roasted Red Pepper Strips");
        toppings.add("Guacamole");
        toppings.add("Goblin Pickled Peppers");
        toppings.add("None/Next");
        List<String> sandwichToppings = new ArrayList<>();
        List<String> sauces = new ArrayList<>();
        sauces.add("Dragon's Breath Sriracha Mayo");
        sauces.add("Mermaid's Seaweed Pesto");
        sauces.add("Enchanted Basilisk Aioli");
        sauces.add("Chimera Roasted Red Pepper Hummus");
        sauces.add("Thousand Islands");
        sauces.add("Vinaigrette");
        sauces.add("None/Next");
        List<String> sides = new ArrayList<>();
        sides.add("Elf-Kissed Quinoa Pilaf");
        sides.add("Harpy's Herb-infused Rice");
        sides.add("None");
        //multiply by our range and then we add one to get our min
        int toppingsRoll = (int) (Math.random() * 10) + 1;
        while (toppingsRoll != 10) {
            sandwichToppings.add(toppings.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 10) + 1;
        }
        toppingsRoll = (int) (Math.random() * 7) + 1;
        while (toppingsRoll != 7) {
            sandwichToppings.add(sauces.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 7) + 1;
        }
        toppingsRoll = (int) (Math.random() * 3) + 1;
        while (toppingsRoll != 3) {
            sandwichToppings.add(sides.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 3) + 1;
        }
        //we generate response between 0 and 1
        int toasted = (int) (Math.random() * 2);
        boolean isToasted = false;
        if (toasted == 1) {
            isToasted = true;
        }
        int extraMeat = (int) (Math.random() * 2);
        boolean isMeaty = false;
        if (extraMeat == 1) {
            isMeaty = true;
        }
        int extraCheese = (int) (Math.random() * 2);
        boolean isCheesy = false;
        if (extraCheese == 1) {
            isCheesy = true;
        }
        //after our funky sandwich has been completed we add to our orders list
        Sandwich rolled = new Sandwich(sizeChoice, bread, meat, cheese, sandwichToppings, isToasted, isMeaty, isCheesy);
        System.out.println("Would you like to add the following rolled sandwich to the order? ");
        System.out.println(rolled.toString());
        String consumerChoice = scanner.nextLine();
        if (consumerChoice.charAt(0) == 'y' || consumerChoice.charAt(0) == 'Y') {
            orders.add(rolled);
        }
    }

    public static void rollAMeal() {
        //same as rollASandwich Method but this it is applied to the whole meal
        int sizeChoice = 0;
        while (sizeChoice != 1 && sizeChoice != 2 && sizeChoice != 3) {
            System.out.println("""
                    How big do you want your sandwich?
                    1) 4"
                    2) 8"
                    3) 12"
                    """);
            sizeChoice = scanner.nextInt();
            scanner.nextLine();
        }
        int meatChoice = (int) (Math.random() * 6) + 1;
        int breadChoice = (int) (Math.random() * 4) + 1;
        int cheeseChoice = (int) (Math.random() * 4) + 1;
        String bread = "";
        String meat = "";
        String cheese = "";
        switch (breadChoice) {
            case 1:
                bread = "Dragon's Ember Barley";
                break;
            case 2:
                bread = "Moonstone Wheat";
                break;
            case 3:
                bread = "Celestial Millet";
                break;
            case 4:
                bread = "Mermaid's Seagrass";
                break;
        }
        switch (meatChoice) {
            case 1:
                meat = "Griffin's Roast";
                break;
            case 2:
                meat = "Dragonfire Sausages";
                break;
            case 3:
                meat = "Unicorn Tenderloin";
                break;
            case 4:
                meat = "Kraken Calamari";
                break;
            case 5:
                meat = "Troll Tender";
                break;
            case 6:
                meat = "Gorgon Charcuterie";
                break;
        }
        switch (cheeseChoice) {
            case 1:
                cheese = "Wyrmwood Cheddar";
                break;
            case 2:
                cheese = "Goblin Blue";
                break;
            case 3:
                cheese = "Elven Moon Cheese";
                break;
            case 4:
                cheese = "Dwarven Forge Gruyère";
                break;
            case 5:
                cheese = "No Cheese";
                break;
        }
        List<String> toppings = new ArrayList<>();
        toppings.add("Centaur-Smoked Tomatoes");
        toppings.add("Mystic Mushroom Medley");
        toppings.add("Dragonfruit Slices");
        toppings.add("Enchanted Herb Butter Lettuce");
        toppings.add("Banshee's Bitter Arugula");
        toppings.add("Siren's Sea Salted Cucumbers");
        toppings.add("Unicorn-Roasted Red Pepper Strips");
        toppings.add("Guacamole");
        toppings.add("Goblin Pickled Peppers");
        toppings.add("None/Next");
        List<String> sandwichToppings = new ArrayList<>();
        List<String> sauces = new ArrayList<>();
        sauces.add("Dragon's Breath Sriracha Mayo");
        sauces.add("Mermaid's Seaweed Pesto");
        sauces.add("Enchanted Basilisk Aioli");
        sauces.add("Chimera Roasted Red Pepper Hummus");
        sauces.add("Thousand Islands");
        sauces.add("Vinaigrette");
        sauces.add("None/Next");
        List<String> sides = new ArrayList<>();
        sides.add("Elf-Kissed Quinoa Pilaf");
        sides.add("Harpy's Herb-infused Rice");
        sides.add("None");
        int toppingsRoll = (int) (Math.random() * 10) + 1;
        while (toppingsRoll != 10) {
            sandwichToppings.add(toppings.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 10) + 1;
        }
        toppingsRoll = (int) (Math.random() * 7) + 1;
        while (toppingsRoll != 7) {
            sandwichToppings.add(sauces.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 7) + 1;
        }
        toppingsRoll = (int) (Math.random() * 3) + 1;
        while (toppingsRoll != 3) {
            sandwichToppings.add(sides.get(toppingsRoll - 1));
            toppingsRoll = (int) (Math.random() * 3) + 1;
        }
        int toasted = (int) (Math.random() * 2);
        boolean isToasted = false;
        if (toasted == 1) {
            isToasted = true;
        }
        int extraMeat = (int) (Math.random() * 2);
        boolean isMeaty = false;
        if (extraMeat == 1) {
            isMeaty = true;
        }
        int extraCheese = (int) (Math.random() * 2);
        boolean isCheesy = false;
        if (extraCheese == 1) {
            isCheesy = true;
        }
        Sandwich rolled = new Sandwich(sizeChoice, bread, meat, cheese, sandwichToppings, isToasted, isMeaty, isCheesy);
        System.out.println("""
                What size Drink would you like?
                1) Small
                2) Medium
                3) Large
                """);
        int size = scanner.nextInt();
        scanner.nextLine();
        int drinkChoice = (int) (Math.random() * 8) + 1;
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
        }
        Drinks drinks = new Drinks(size, drink);
        String chips = "";
        int chipsChoice = (int) (Math.random() * 6) + 1;
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
        Chips chip = new Chips(1, chips);
        System.out.println(rolled.toString());
        System.out.println(drinks.toString());
        System.out.println(chip.toString());
        System.out.println("""
                Wilt thou include the meal, a dish of magical essence, to thy feast?
                Yay
                Nay
                """);
        String consumerChoice = scanner.nextLine();
        if (consumerChoice.charAt(0) == 'y' || consumerChoice.charAt(0) == 'Y') {
            orders.add(rolled);
            orders.add(drinks);
            orders.add(chip);
        }
    }
}