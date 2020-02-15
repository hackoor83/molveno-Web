package com.example.molveno.importedVanProject.reservation.subclasses;

//import com.capgemini.molveno.restaurant.reservation.Tables;

import com.example.molveno.importedVanProject.reservation.Tables;

import java.util.Scanner;

public class AvailabilityChecker {

    public static String reservationDateTime = null;

    public static String availabilityCheck(int requiredTables) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAvailable tables:   " + Tables.getTotalTables() + " with " + Tables.getTotalTables() * 2 + " seats.\n");

        if (requiredTables <= Tables.getTotalTables()) {
            System.out.println("\nPlease specify the date and time. On which date of the day? \n");
            int day = scanner.nextInt();
            System.out.println("\nWhich month? \n");
            int month = scanner.nextInt();
            System.out.println("\nWhich year? \n");
            int year = scanner.nextInt();
            System.out.println("\n When? (hh:mm)\n");
            String time = scanner.next();
            reservationDateTime = day + " /" + month + " /" + year + " at " + time;
            System.out.println("\n We have enough tables for this reservation on " + reservationDateTime);
        } else {
            System.out.println("\n We do not have enough tables for this reservation.\n");
        }
        return reservationDateTime;
    }

}
