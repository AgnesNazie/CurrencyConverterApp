package com.agnes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Display menu
        while (true) {
            System.out.println(" Currency Converter Menu: ");
            System.out.println(" 1. Convert SEK to USD");
            System.out.println(" 2. Convert USD to SEK");
            System.out.println(" 3. Convert SEK to EUR");
            System.out.println(" 4. Convert EUR to SEK");
            System.out.println(" 5. Exit the Currency Convert App");
            System.out.println(" Enter your choice");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input1 please choice a valid option");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid number. Please enter a number between 1 and 4");
                continue;
            }

            if (choice == 5) {
                System.out.println(" Thank you for using the Currency Converter App. Goodbye!");
                break;
            }
            System.out.println("Enter amount: ");

            double amount = scanner.nextDouble();
            if (amount < 0) {
                System.out.println(" Invalid amount please enter the right amount");
                continue;
            }
            double convertedAmount = 0;
            String currency = " ";

            switch (choice) {
                case 1:
                convertedAmount = amount * 0.095;
                currency = "USD";
                break;
                case 2:
                convertedAmount = amount * 10.52;
                currency = "SEK";
                break;
                case 3:
                convertedAmount = amount * 0.089;
                currency = "EUR";
                break;
                case 4:
                convertedAmount = amount * 11.22;
                currency = "SEK";
                break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("eeee-MM-dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Converted Amount : " +  convertedAmount + " " + currency);
            System.out.println("Conversion Date : " + dateTimeFormatter.format(now));
        }
        scanner.close();
    }
}

