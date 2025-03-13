package com.agnes;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static double getValidAmount() {
        while (true) {
            try {
                System.out.println("Enter amount: ");
                double amount = Double.parseDouble(scanner.nextLine());
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Amount must be valid ");
                }
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid number.");
            }
        }
    }
}
