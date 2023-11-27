package com.pluralsight;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public abstract class CustomerReceipt {
    public static void receiptReader()throws IOException{
        //create Writer
        LocalDateTime receiptTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String fileName = "src/main/Receipts/" + receiptTime.format(dateTimeFormatter) + ".txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(fileName);
        }
    }



