package com.example.molveno.importedVanProject.reservation;

public class Guest {

    String firstName, lastName, telNo, email;

    public Guest(String firstName, String lastName, String telNo, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNo = telNo;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getEmail() {
        return email;
    }

}
