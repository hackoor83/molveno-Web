package com.example.molveno.importedVanProject.menuitems;


public class Category {
    private String categoryName;


    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String printData() {
        String data;
        data = categoryName;
        return data;
    }
}
