package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static int MAX_AUTO = 40;
    private static int MAX_MOTO = 20;
    private static int MAX_CAMION = 10;

    private ArrayList<User> autoSpots = new ArrayList<>(MAX_AUTO);
    private ArrayList<User> motoSpots = new ArrayList<>(MAX_MOTO);
    private ArrayList<User> camionSpots = new ArrayList<>(MAX_CAMION);


    public Menu() {
        while (true) {
            printMenu();
            int choice = readIntInput();

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    displayHourlyRates();
                    break;
                case 3:
                    listOccupiedSpots();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Scelta errata");
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("___BENVENUTO NEL BUNKER___");
        System.out.println("1. REGISTRAZIONE");
        System.out.println("2. TARIFFE ORARIE");
        System.out.println("3. VISUALIZZA POSTI LIBERI");
        System.out.println("4. CALCOLA TARIFFA");
        System.out.print("Seleziona: ");
    }

    private int readIntInput() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            return -1;
        }
    }

    private void registerUser() {
        System.out.println("Inserisci nome: ");
        String nome = scanner.next();

        System.out.println("Inserisci cognome: ");
        String cognome = scanner.next();

        System.out.println("Inserisci targa: ");
        String targa = scanner.next();

        System.out.println("Inserisci marca: ");
        String marca = scanner.next();

        System.out.println("Inserisci immatricolazione: ");
        String immatricolazione = scanner.next();




        User user = new User(nome, cognome, targa, marca, immatricolazione);


        System.out.println("Che tipo di veicolo è?");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Camion");
        int vehicleType = readIntInput();

        switch (vehicleType) {
            case 1:
                registerVehicle(user, autoSpots, MAX_AUTO);
                break;
            case 2:
                registerVehicle(user, motoSpots, MAX_MOTO);
                break;
            case 3:
                registerVehicle(user, camionSpots, MAX_CAMION);
                break;
            default:
                System.out.println("Tipo di veicolo non valido.");
                break;
        }
    }

    private void registerVehicle(User user, ArrayList<User> vehicleSpots, int maxSpots) {
        if (vehicleSpots.size() >= maxSpots) {
            System.out.println("Il parcheggio per questo tipo di veicolo è pieno.");
        } else {
            vehicleSpots.add(user);
            System.out.println("Veicolo registrato con successo.");
        }
    }

    private void displayHourlyRates() {
        System.out.println("Tariffe 1 ora:");
        System.out.println("Auto 2,50 euro");
        System.out.println("Moto 1,50 euro");
        System.out.println("Camion 3,50 euro");
    }

    private void listOccupiedSpots() {
        System.out.println("Posti liberi:");

        System.out.println("Auto: " + (MAX_AUTO - autoSpots.size()));
        System.out.println("Moto: " + (MAX_MOTO - motoSpots.size()));
        System.out.println("Camion: " + (MAX_CAMION - camionSpots.size()));
    }


    private void exit() {
        System.out.println("Grazie per aver utilizzato il Bunker!");
    }


}



