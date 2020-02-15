package com.example.molveno.importedVanProject.reservation;

public class Reservation {

    private int numOfTables;
    private String guestFirstName;
    private String guestLastName;
    private String dateNtime;

    public Reservation(String guestFirstName, String guestLastName, int numOfTables, String dateNtime){
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.numOfTables = numOfTables;
        this.dateNtime = dateNtime;
    }

    public int getNumOfTables() {
        return numOfTables;
    }


    public String getGuestFirstName() { return guestFirstName; }

    public String getGuestLastName() {
        return guestLastName;
    }

    public String getDateNtime() {
        return dateNtime;
    }
}
