package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.pluralsight.OrderScreen.*;
import static com.pluralsight.OrderScreen.dmt;

//Co-written by Josh, Jake, Paul and Angel
public class CustomerReceipt {

    public static void receiptReader(List<Food> foods, double totalPrice) throws IOException {
        //create Writer
        LocalDateTime receiptTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        //Above formats date and time for capstone requirements

        //File name includes path and adds local time to it
        String fileName = "src/main/Receipts/" + receiptTime.format(dateTimeFormatter) + ".txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        //We create a variable with f to represent Food object in the foods list
        //It then displays our food chosen by user with formatted price
        for (Food f : foods) {
            bufferedWriter.write(f.toString() + "\nPrice: " + dmt.format(f.getPrice()));
            bufferedWriter.newLine();
        }
        bufferedWriter.write("Total Price: " + dmt.format(totalPrice));
        bufferedWriter.close();

    }
}



