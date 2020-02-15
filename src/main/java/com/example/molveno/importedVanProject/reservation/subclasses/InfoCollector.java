package com.example.molveno.importedVanProject.reservation.subclasses;

import java.util.Scanner;

public class InfoCollector {

    public static void infoCollector(int requiredTables) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Guest first name: ");
        String guestFirstName = scanner.next();
        if (guestFirstName != null) {
            //Prompt for the guest last name:
            System.out.println("\n Guest last name: ");
            String guestLastName = scanner.next();
            if (guestLastName != null) {
                //Prompt for the telephone number:
                System.out.println("\n Telephone number: \n");
                String guestTelNum = scanner.next();
                if (guestTelNum != null) {
                    //Prompt for the email address:
                    System.out.println("\n Email address: \n");
                    String emailAddress = scanner.next();
                    if (emailAddress != null) {
                        CreateReservation.newReservation(
                                guestFirstName,
                                guestLastName,
                                requiredTables,
                                AvailabilityChecker.reservationDateTime);
                    } else {

                        System.out.println(" !!! Can't be left blank !!!");
                    }
                } else {

                    System.out.println(" !!! Can't be left blank !!!");
                }
            } else {

                System.out.println(" !!! Can't be left blank !!!");
            }
        } else {

            System.out.println(" !!! Can't be left blank !!!");
        }
    }
}
