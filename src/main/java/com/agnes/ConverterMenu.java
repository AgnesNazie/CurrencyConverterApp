package com.agnes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConverterMenu {
    private static final Scanner scanner = new Scanner(System.in);

   public  static void display() {
        while (true) {
            System.out.println("\n Exchange Converter");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to EUR");
            System.out.println("4. Convert EUR to SEK");
            System.out.println("5.Exit");
            System.out.println("Choose an option: ");

            String choice = scanner.nextLine();
            if (choice.equals("5")) {
                System.out.println("Existing...");
                break;
            }
            processChoice(choice);
        }
    }

    public static void processChoice(String choice) {

        String from = "", to = "";
        switch (choice) {
            case "1":
                from = "SEK"; to = "USD";
                break;
            case "2":
                from = "USD"; to = "SEK";
                break;
            case "3":
                from = "SEK"; to = "EUR";
                break;
            case "4":
                from = "EUR"; to = "SEK";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        double amount = Validator.getValidAmount();
        double convertedAmount = ExchangeConverter.convert(from, to, amount);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("eeee-MM-dd HH:mm:ss"));
        System.out.printf("Converted  %.2f %s to %.2f %s (Date: %s)%n", amount, from, convertedAmount, to, timestamp);
    }


}
