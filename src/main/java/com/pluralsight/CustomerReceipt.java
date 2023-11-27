package com.pluralsight;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public abstract class CustomerReceipt implements CustomerOrder{
    public static void receiptReader()throws IOException{
        String input;
        LocalDate orderDate;
        LocalTime orderTime;
        String sandwichBread;
        String sandwichToppings;
        double orderAmount;
        //create Readers
        LocalDateTime receiptTime = null;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        FileReader fileReader = new FileReader(receiptTime.format(dateTimeFormatter));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((input = bufferedReader.readLine()) == null){
         String [] receiptReader = input.split("\\ ");
         orderDate = LocalDate.parse(receiptReader[0]);
         orderTime = LocalTime.parse(receiptReader[1]);
         sandwichBread = receiptReader[2];
         sandwichToppings = receiptReader[3];
         orderAmount = Double.parseDouble(receiptReader[4]);
         //store into array list


        }

    }


}
