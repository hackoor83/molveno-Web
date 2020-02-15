package com.example.molveno.importedVanProject.menuitems;

import java.text.NumberFormat;

public class Burger {

    private String burgerName;
    private double price;
    private NumberFormat numFormat= NumberFormat.getCurrencyInstance();

    // Define a constructor
    public Burger(String burgerName, double price) {
        this.burgerName = burgerName;
        this.price = price;
    }

    public String getBurgerName() {

        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String printData() {
        String data;
        data =  burgerName + " - " + "\t"+numFormat.format(price);
        return data;
    }
}
