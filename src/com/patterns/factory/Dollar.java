package com.patterns.factory;

public class Dollar implements Currency{

    @Override
    public String getPrefix() {
        return "US$";
    }
}
