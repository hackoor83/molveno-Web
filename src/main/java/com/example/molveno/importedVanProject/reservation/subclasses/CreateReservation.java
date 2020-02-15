package com.example.molveno.importedVanProject.reservation.subclasses;

//import com.capgemini.molveno.restaurant.reservation.Reservation;
import com.example.molveno.importedVanProject.reservation.Reservation;

import java.util.ArrayList;

public class CreateReservation {

    public static ArrayList<Reservation> reservationsRepo = new ArrayList<Reservation>();

    public static void newReservation(String guestFirstName, String guestLastName, int requiredTables, String reservationDateTime) {

        Reservation createReservation = new Reservation(guestFirstName, guestLastName, requiredTables, reservationDateTime);
        reservationsRepo.add(createReservation);
        System.out.println("\n Details collected. Reservation successful, below are the confirmation details: \n");
        System.out.println("\n" + "\u001B[33m" +
                "┌─────────────────────────┬─────────────────────────────┐\n" +
                "│   Reservation details   │         Guest details       │\n" +
                "├─────────────────────────┼─────────────────────────────┘\n" +
                "│ Guest first name        │" + reservationsRepo.get(0).getGuestFirstName() + "\n" +
                "│ Guest last name         │" + reservationsRepo.get(0).getGuestLastName() + "\n" +
                "│ Date of reservation     │" + reservationsRepo.get(0).getDateNtime() + "\n" +
                "│ Number of tables        │" + reservationsRepo.get(0).getNumOfTables() + "\n" +
                "└─────────────────────────┴─────────────────────────────\n" +
                "\n");

    }
}
