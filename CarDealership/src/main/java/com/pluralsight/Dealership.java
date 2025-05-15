package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicles> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public void removeVehicle(Vehicles vehicles){
        return;
    }

    public void addVehicle(Vehicles vehicles){
        inventory.add(vehicles);
    }
    public List<Vehicles> getAllVehicles(){
        return inventory;
    }

    public List<Vehicles> getVehiclesByPrice(double min,double max){
        return null;
    }
    public List<Vehicles> getVehicleByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicles> getVehicleByYear(int min, int max) {
        return null;
    }
    public List<Vehicles> getVehicleByColor(String color){
        return null;
    }
    public List<Vehicles> getVehiclesByMileage(long odometer){
        return null;
    }
    public List<Vehicles> getVehiclesByType(String vehicleType){
        return null;
    }


}
