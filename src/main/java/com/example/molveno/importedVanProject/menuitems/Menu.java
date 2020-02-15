package com.example.molveno.importedVanProject.menuitems;

import java.util.ArrayList;

public class Menu {
    // Fields Definition
    private int id;
    private String menuName;
    public  ArrayList<Sandwich> mySandwich = new ArrayList<>();
    public  ArrayList<Coffee> myCoffee = new ArrayList<>();
    public  ArrayList<Juice> myJuice = new ArrayList<>();
    public  ArrayList<Pizza> myPizza = new ArrayList<>();
    public  ArrayList<Burger> myBurger = new ArrayList<>();
    public  ArrayList<Category> myCategory = new ArrayList<>();
    public  ArrayList<Menu> myMenu = new ArrayList<>();

    // constructor
    public Menu() {
        initializeData();
    }

    public Menu(String menuName) {
        this.menuName = menuName;

    }
    //defining setter and getter for the variables


    public void setMenuName(String menuName) {

        this.menuName = menuName;
    }

    public String getMenuName() {

        return menuName;
    }

    // Custom methods
    public void initializeData() {

        //  Initialize the Menu data
        myMenu.add(new Menu("Main Menu"));
        myMenu.add(new Menu("Kids Menu"));
        myMenu.add(new Menu("Vegetarian Menu"));

        // Initialize the Categories data
        myCategory.add(new Category("Pizza's"));
        myCategory.add(new Category("Burgers"));
        myCategory.add(new Category("Sandwiches"));
        myCategory.add(new Category("Drinks"));

        // Initialize the Burger data
        myBurger.add(new Burger("Beef Burgers", 2.0));
        myBurger.add(new Burger("Turkey Burgers", 3.0));
        myBurger.add(new Burger("Veggie Burgers", 2.50));
        myBurger.add(new Burger("Bison Burgers", 1.50));
        myBurger.add(new Burger("Cheese Burgers", 3.30));

        // Initialize the Sandwich data
        mySandwich.add(new Sandwich("Submarine sandwich", 4.0));
        mySandwich.add(new Sandwich("Cheese sandwich", 3.60));
        mySandwich.add(new Sandwich("Chicken sandwich", 3.80));
        mySandwich.add(new Sandwich("Cuban sandwich", 1.20));
        mySandwich.add(new Sandwich("HotDog sandwich", 2.10));

        // Initialize the Pizza's data
        myPizza.add(new Pizza("Mushrom Pizza", 3.0));
        myPizza.add(new Pizza("Cheese Pizza", 5.0));
        myPizza.add(new Pizza("Greek Pizza", 4.0));
        myPizza.add(new Pizza("Tuna Pizza", 4.0));

        // Initialize the Coffee data
        myCoffee.add(new Coffee("Espresso", 2.50));
        myCoffee.add(new Coffee("Cappuccino", 2.60));
        myCoffee.add(new Coffee("CoffeeLatte", 2.80));
        myCoffee.add(new Coffee("Dark Coffee", 2.20));
        myCoffee.add(new Coffee("Cappuccino", 2.10));

        // Initialize the Juices data
        myJuice.add(new Juice("Apple", 2.0));
        myJuice.add(new Juice("Orange", 2.0));
        myJuice.add(new Juice("Prune", 1.0));
        myJuice.add(new Juice("Lemon", 2.30));
        myJuice.add(new Juice("Grape", 2.50));

    }

    public String printData() {
        String data;
        data = menuName;
        return data;

    }
}
