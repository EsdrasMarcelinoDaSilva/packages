package com.patterns.factory;

public class Real implements Currency{

    @Override
    public String getPrefix() {
        return "R$";
    }
}
