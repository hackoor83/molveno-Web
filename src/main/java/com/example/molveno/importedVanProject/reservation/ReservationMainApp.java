package com.example.molveno.importedVanProject.reservation;

//import com.capgemini.molveno.restaurant.menu.menuitems.Application;
//import com.capgemini.molveno.restaurant.reservation.subclasses.*;
import com.example.molveno.importedVanProject.menuitems.Application;
import com.example.molveno.importedVanProject.reservation.subclasses.AvailabilityChecker;
import com.example.molveno.importedVanProject.reservation.subclasses.InfoCollector;
import com.example.molveno.importedVanProject.reservation.subclasses.ListReservations;
import com.example.molveno.importedVanProject.reservation.subclasses.ShowResMenu;

import java.util.Scanner;

public class ReservationMainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Tables Tables = new Tables();

        System.out.println("\n" + "\u001B[31m" +
                "\n" +
                " ______        _             1              ______                                                   \n" +
                "|  ___ \\      | |                         (_____ \\            _                                _    \n" +
                "| | _ | | ___ | |_   _ ____ ____   ___     _____) ) ____  ___| |_  ____ _   _  ____ ____ ____ | |_  \n" +
                "| || || |/ _ \\| | | | / _  )  _ \\ / _ \\   (_____ ( / _  )/___)  _)/ _  | | | |/ ___) _  |  _ \\|  _) \n" +
                "| || || | |_| | |\\ V ( (/ /| | | | |_| |        | ( (/ /|___ | |_( ( | | |_| | |  ( ( | | | | | |__ \n" +
                "|_||_||_|\\___/|_| \\_/ \\____)_| |_|\\___/         |_|\\____|___/ \\___)_||_|\\____|_|   \\_||_|_| |_|\\___)\n" +
                "                                                                                                    \n");

        java.awt.Toolkit.getDefaultToolkit().beep();

        boolean reshowMenu = true;
        do {
            ShowResMenu.showResMenu();
            int choiceNum = scanner.nextInt();
            switch (choiceNum) {
                case 1:
                    System.out.println("Please specify the required number of tables for this reservation: \n");
                    int requiredTables = scanner.nextInt();
                    AvailabilityChecker.availabilityCheck(requiredTables);
                    InfoCollector.infoCollector(requiredTables);
                    Tables.setTotalTables(requiredTables);
                    break;

                case 2:
                    ListReservations.listReservations();
                    break;

                case 3:
                    System.out.println(
                            "=======================================================================\n" +
                                    "\n We have " + Tables.getTotalTables() + " tables available.\n" +
                                    "=======================================================================\n");
                    break;
                case 4:
                    //Show restaurant menu:
                    System.out.println("\n" +
                            "___  ___                 \n" +
                            "|  \\/  |                 \n" +
                            "| .  . | ___ _ __  _   _ \n" +
                            "| |\\/| |/ _ \\ '_ \\| | | |\n" +
                            "| |  | |  __/ | | | |_| |\n" +
                            "\\_|  |_/\\___|_| |_|\\__,_|\n" +
                            "                         \n" +
                            "                         \n");
                    Application.showMenu();

                default:
                    ShowResMenu.showResMenu();
            }

        } while (reshowMenu);

//        ShowResMenu.showResMenu();

        System.out.println("=======================================================================\n");
        System.out.println("\n Total available number of tables for future bookings: " + Tables.getTotalTables());
        System.out.println("=======================================================================\n");

        Application.showMenu();
    }

}
