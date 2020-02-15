package com.example.molveno.importedVanProject.menuitems;

import java.text.NumberFormat;

public class Pizza {

    String pizzaTopping;
    double price;
    private NumberFormat numFormat= NumberFormat.getCurrencyInstance();


    //constructor

    public Pizza(String pizzaTopping, double price) {
        this.pizzaTopping = pizzaTopping;
        this.price = price;
    }

    //declare variables
    private Size size;
    //  private Topping topping;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String printData() {
        String data;
        data = pizzaTopping + " -" + "\t" +numFormat.format(price);
        return data;

    }
}
