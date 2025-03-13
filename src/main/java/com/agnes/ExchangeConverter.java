package com.agnes;

public class ExchangeConverter {
    public static double convert(String from, String to, double amount) {
        return switch (from + "_" + to) {
            case "SEK_USD" -> amount * ExchangeRates.SEK_TO_USD;
            case "USD_SEK" -> amount * ExchangeRates.USD_TO_SEK;
            case "SEK_EUR" -> amount * ExchangeRates.SEK_TO_EUR;
            case "EUR_SEK" -> amount * ExchangeRates.EUR_TO_SEK;
            default -> throw new IllegalArgumentException("Invalid currency pair.");
        };

    }
}
