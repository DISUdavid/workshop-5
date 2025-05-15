package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Dealership dealership = new Dealership("A","B", "55-55");
    Vehicles vehicles = new Vehicles(777,98,"Ford","Escape", "SUV","Green", 5555555, 9999.99);
        System.out.println("Welcome Customer, is this your info correct?" + dealership);
        dealership.addVehicle(vehicles);

        for(Vehicles vehicles1 : dealership.getAllVehicles()){
            System.out.println(vehicles1.getColor() + vehicles1.getModel() + vehicles1.getPrice());
        }


    }
}

