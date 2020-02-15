package com.example.molveno.importedVanProject.menuitems;

import java.text.NumberFormat;

public class Coffee {
    private int id;
    String coffeeItems;
    private NumberFormat numFormat= NumberFormat.getCurrencyInstance();
    private boolean availability;
    public double price;

    //Constructor
    Coffee(String coffeeItems, double price) {
        this.coffeeItems = coffeeItems;
        this.price = price;
    }


    public void idIncrement(int idDrink) {
        this.id = idDrink;
    }


    public String getCoffeeItems() {
        return coffeeItems;
    }

    public void setCoffeeItems(String coffeeItems) {
        this.coffeeItems = coffeeItems;
    }

    public String printData() {
        String data = coffeeItems + "-" + " \t\t" + numFormat.format(price);
        return data;
    }
}

