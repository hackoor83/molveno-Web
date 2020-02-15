package com.example.molveno.importedVanProject.menuitems;



import java.util.Scanner;

public class Application {


    // Define Fields

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static Menu menu = new Menu();


     // Main Application
    public static void main(String[] args) {


        showMenu();

    }

    public static void showMenu() {

        int input, input2, input3 = 0;

        do {
            mainMenuOptions();
            input = sc.nextInt();
            switch (input) {
                case 1:
                    do {
                        mainMenuItemsOptions();
                        input2 = sc.nextInt();
                        switch (input2) {
                            case 1:
                                System.out.println("=================================");
                                System.out.println("Pizza Types and prices");
                                System.out.println("=================================");
                                for (int i = 0; i < menu.myPizza.size(); i++) {
                                    System.out.println(menu.myPizza.get(i).printData());
                                }
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("=================================");
                                System.out.println("Burger Names and prices");
                                System.out.println("=================================");
                                for (int i = 0; i < menu.myBurger.size(); i++) {
                                    System.out.println(menu.myBurger.get(i).printData());
                                }
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println("=================================");
                                System.out.println("Sandwiches Names and prices");
                                System.out.println("=================================");
                                for (int i = 0; i < menu.mySandwich.size(); i++) {
                                    System.out.println(menu.mySandwich.get(i).printData());
                                }
                                System.out.println("\n");
                                break;
                            case 4:
                                do {
                                    drinksMenuOptions();
                                    input3 = sc.nextInt();
                                    switch (input3) {
                                        case 1:
                                            System.out.println("=================");
                                            System.out.println("Coffees" + "\t\t" + "Price");
                                            System.out.println("=================");
                                            for (int i = 0; i < menu.myCoffee.size(); i++)
                                                System.out.println(menu.myCoffee.get(i).printData());
                                            System.out.println("\n");
                                            break;
                                        case 2:
                                            System.out.println("=================");
                                            System.out.println("Juices" + "\t\t" + "Price");
                                            System.out.println("=================");
                                            for (int i = 0; i < menu.myJuice.size(); i++)
                                                System.out.println(menu.myJuice.get(i).printData());
                                            System.out.println("\n");
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (input3 != 3);
                        }
                    } while (input2 != 5);
                    break;
                case 2: case 3:
                    System.out.println("Nothing yet...");
                    break;
            }

        } while (input != 4);

        // end of the show method
    }


    // Main menu List
    public static void mainMenuOptions() {

        for(int i=0; i<menu.myMenu.size(); i++){
            System.out.println((i+1)+"."+menu.myMenu.get(i).printData());
        }
        System.out.println("4. Exit");
        System.out.println("Please Enter your Choice");
    }

    // Drinks Menu List
    public static void drinksMenuOptions() {

        System.out.println("1. Coffee Drinks");
        System.out.println("2. Jucies");
        System.out.println("3. Back");
        System.out.println("Please choose a number");
    }

    // Main Menu Items List
    public static void mainMenuItemsOptions() {

        for(int i=0;i<menu.myCategory.size();i++){
            System.out.println((i+1)+"."+menu.myCategory.get(i).printData());
        }
        System.out.println("5.Back ");
        System.out.println("Please choose a number");

    }

}
