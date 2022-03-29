package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String dealershipName;
    private List<Car> availableCars;
    private List<Car> soldCars;

   public Dealership(String dealershipName){
       this.dealershipName = dealershipName;
       this.availableCars = new ArrayList<>();
       this.soldCars = new ArrayList<>();
   }

   public String getDealershipName(){
       return dealershipName;
    }

    public List<Car> getAvailableCars(){
       return availableCars;
    }

    public List<Car> getSoldCars () {
       return soldCars;
    }

    public void setDealershipName(String autoWorld) {
        this.dealershipName = dealershipName;
    }

    public void setAvailableCars(ArrayList availableCars){
       this.availableCars = availableCars;
    }

    public void setSoldCars (List<Car> soldCars){
       this.soldCars = soldCars;
    }

    public void buyCar(String license) {
       for (int i = 0; i < availableCars.size(); i++) {
           if (license.equals(availableCars.get(i).getLicensePlate())){
               soldCars.add(availableCars.get(i));
               availableCars.remove(i);
           }


       }

    }
    public void renturnCar(String license) {
        for(int i = 0; i < soldCars.size(); i++) {
            if (license.equals(soldCars.get(i).getLicensePlate())){
                availableCars.add(soldCars.get(i));
                soldCars.remove(i);
            }
        }
    }
    public void displayInventory() {
       for(int i = 0; i < availableCars.size(); i++) {
           System.out.println(availableCars.get(i));
       }
    }

}
