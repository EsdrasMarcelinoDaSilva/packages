package com.patterns.factory;

public class CurrencyFactory {
    public static Currency getInstance(String country){
        return switch (country) {
            case "EUA" -> new Dollar();
            case "BR" -> new Real();
            default -> throw new IllegalArgumentException("Country not found");
        };
    }
}
