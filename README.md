# Dungeons-n-Delicious-Sandwich-Shop - Java CLI Point of Sales Application
## Overview:
DND Sandwich Shop POS is a custom application developed in Java. This project addresses the need to automate the order process for DND, a growing sandwich shop that allows customers to fully customize their sandwich orders. The application is designed as a command-line interface (CLI) and follows Object-Oriented Analysis and Design principles.

## Key Features:
Customization Options:
## Home Screen:
### Here are users are greeted with this Home Screen.
![img_1.png](img_1.png)

### Customers can order sandwiches in three sizes (4", 8", and 12").
![img_3.png](img_3.png)

### Choose from various types of bread.
![img_4.png](img_4.png)

### Choose from various types of meats.
![img_5.png](img_5.png)

### Add extra meat with an additional cost.
![img_6.png](img_6.png)

### Choose from various types of cheese.
![img_7.png](img_7.png)

### Add extra cheese with an additional cost.
![img_8.png](img_8.png)

### Specify whether the sandwich should be toasted.
![img_10.png](img_10.png)

### Customize toppings.
![img_9.png](img_9.png)

### Selection of sauces.
![img_11.png](img_11.png)

### Selection of sides.
![img_12.png](img_12.png)

### Order Management:
![img_2.png](img_2.png)

#### Customers can place an order with one or more sandwiches.
#### Each sandwich is customizable, allowing for a personalized experience.
#### Drinks and chips can be added to the order.

### Our drink selection.
![img_13.png](img_13.png)

### Our chip selection. 
![img_14.png](img_14.png)

### User can remove an item from their order.
![img_18.png](img_18.png)
### User can cancel order.
![img_19.png](img_19.png)
### Order Display and Receipts:
The application displays order details, including the list of sandwiches with toppings.
Shows the total cost of the order.
![img_15.png](img_15.png)
### When the order is completed, a receipt file is generated and saved with a timestamp.
![img_20.png](img_20.png)
![img_16.png](img_16.png)

#### User will be greeted with the following prompt.
### A new receipt file will be created.
![img_17.png](img_17.png)

## Technical Details:
Object-Oriented Design:
The project leverages Object-Oriented Analysis and Design principles.
Classes and interfaces are used to structure the solution, promoting modularity and maintainability.

## Project Setup:
The codebase is hosted on GitHub, providing a collaborative environment for team members.
A project board on GitHub is utilized for managing tasks and tracking progress.

## User Interaction:
The application employs a user-friendly CLI with a series of screens for order creation and management.
Options are provided to navigate through the ordering process, and user input is validated.

## Flexibility and Extensibility:
The code is structured to accommodate future enhancements, such as online order capabilities.

## Class Diagram:
![DND Sandwich Shop](https://github.com/Joshua722/Dungeons-n-Delicious-Sandwich-Shop/assets/14105717/db76a432-3261-4daf-847c-c9155c0d4a3f)

## How to Use:
1. Clone the Repository:
Team members can easily clone the project repository to their local machines.

2. Run the Application:
The application can be executed by running the java com.pluralsight.Main command.
User Interaction:

3. Users navigate through a series of screens (Home, Order, Add Sandwich, Add Drink, Add Chips, Checkout) to create and manage orders.

## Contribution Guidelines:
Collaborative Development:
The project encourages collaboration through forking, creating feature branches, and submitting pull requests.
### Our favorite piece of code that we wrote:
#### Joshua:
![img.png](img.png)

This piece of code creates a string with the variable fileName and I included the file path where its going to be at.
Then I concatenate the local date and time while inserting into the time formatter that was created earlier on in
the class. In the next line we will be creating that file with a bufferedWriter, using a BufferedWriter allows to it
be more precise.

#### Paul:
![image](https://github.com/Joshua722/Dungeons-n-Delicious-Sandwich-Shop/assets/14105717/c72349dc-3fce-4122-80bf-c247dcd5e9f3)
Input validation is a very important practice in creating robust and user-friendly programs. The above code segment uses a switch statement to handle user input for selecting the size of a sandwich. The while loop prompts the user until a valid size (1, 2, or 3) is entered. This validation is crucial for preventing errors, enhancing the user experience by guiding them to correct inputs, so that the code that is likely dependent on the validated input, executes accurately.


#### Angel: 

#### Jake:
![Dungeons-n-Delicious-Sandwich-Shop – Sandwich java 11_29_2023 1_14_14 PM](https://github.com/Joshua722/Dungeons-n-Delicious-Sandwich-Shop/assets/146876325/60234375-d8a7-424e-8a3f-2899da5b6aef)


This luxurious piece of code allows for objects to have String implementations. I like to follow a simple path: K.I.S.S.
It means "Keep It Simple, Stupid" and the toString() override makes output statements as simple as calling the object and
the toString() method applied to the object.
## Conclusion:
DND Sandwich Shop POS is not just a Java CLI application; it represents a thoughtfully designed solution that enhances the customer experience at a sandwich shop. Its user-friendly interface, and collaborative development approach make it a valuable asset for DND as it continues to grow and innovate in the food industry.
