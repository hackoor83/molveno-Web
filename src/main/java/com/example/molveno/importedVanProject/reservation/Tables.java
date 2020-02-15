package com.example.molveno.importedVanProject.reservation;

public class Tables {
    private static int totalTables = 30;

    public void setTotalTables(int totalTables) {
        this.totalTables -= totalTables;
    }

    public static int getTotalTables() {
        return totalTables;
    }

}

