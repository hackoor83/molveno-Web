package com.example.molveno.importedVanProject.menuitems;

import java.text.NumberFormat;


public class Juice {

    String juice;
    double price;
    private NumberFormat numFormat= NumberFormat.getCurrencyInstance();

   public  Juice(String juice, double price) {
        this.juice = juice;
        this.price = price;

    }

    // defining setter and getter

    public String getJuices() {
        return juice;
    }

    public void setJuices(String juice) {
        this.juice = juice;
    }

    public String printData() {
        String data;
        data = juice + " - " + "\t" + numFormat.format(price);
        return data;

    }

}
