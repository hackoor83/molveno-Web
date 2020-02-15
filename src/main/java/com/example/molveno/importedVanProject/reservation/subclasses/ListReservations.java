package com.example.molveno.importedVanProject.reservation.subclasses;

//import com.capgemini.molveno.restaurant.reservation.Reservation;

import com.example.molveno.importedVanProject.reservation.Reservation;

public class ListReservations {

    public static void listReservations(){

        System.out.println("\n Below are the confirmed reservations so far: \n");

        for (int i = 0; i < CreateReservation.reservationsRepo.size(); i++) {
            Reservation reservation = CreateReservation.reservationsRepo.get(i);
            System.out.println("=================================================================");
            System.out.println((i + 1) + " -" + reservation.getGuestLastName() + ", " + reservation.getGuestFirstName() + " on " + reservation.getDateNtime() + ", " +
                    reservation.getNumOfTables() + " tables.");
            System.out.println("=================================================================");
        }

    }

}
