package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    private static final String filePath = "src/main/resources/WorkshopFiles/inventory.csv";


    public Dealership getDealership() {
        Dealership dealership = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String dealershipInfo;
            if ((dealershipInfo = reader.readLine()) !=null) {
                String[] infoParts = dealershipInfo.split("\\|");

                String name = infoParts[0];
                String address = infoParts[1];
                String phoneNumber = infoParts[2];

               dealership = new Dealership(name,address,phoneNumber);


            }


            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 8) {

                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    long odometer = Long.parseLong(parts[6]);
                    double price = Double.parseDouble(parts[7]);



                    Vehicles vehicles = new Vehicles(vin, year, make, model, vehicleType, color, odometer, price);
                    if (dealership != null){
                        dealership.addVehicle(vehicles);
                    }
                }
            }


        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
        return dealership;


    }

    public void saveDealership(Dealership dealership){

    }
}

