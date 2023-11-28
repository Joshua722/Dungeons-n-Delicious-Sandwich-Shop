package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.pluralsight.OrderScreen.*;

import static com.pluralsight.OrderScreen.dmt;

public abstract class CustomerReceipt {
    public static void receiptReader(List<Food> foods, double totalPrice) throws IOException {
        //create Writer
        LocalDateTime receiptTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String fileName = "src/main/Receipts/" + receiptTime.format(dateTimeFormatter) + ".txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Food f : foods) {
            bufferedWriter.write(f.toString() + " Price: " + dmt.format(f.getPrice()));
            bufferedWriter.newLine();
        }
        bufferedWriter.write("Price: " + dmt.format(totalPrice));
        bufferedWriter.close();

    }
}



