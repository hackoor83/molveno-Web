package com.example.molveno.importedVanProject.menuitems;

import java.text.NumberFormat;

public class Sandwich {


        String sandwichName;
        double price;
    private NumberFormat numFormat= NumberFormat.getCurrencyInstance();

        public Sandwich(String sandwichName, double price) {
            this.sandwichName= sandwichName;
            this.price= price;
        }

        public String printData() {
            String data = sandwichName + "-" + " \t\t" + numFormat.format(price);
            return data;
        }
    }


