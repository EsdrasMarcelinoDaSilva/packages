package com.patterns.factory;

public class Manufactured {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.getInstance("CAD");
        System.out.println(currency.getPrefix());
    }
}
