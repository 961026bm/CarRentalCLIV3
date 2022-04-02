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

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public void setAvailableCars(ArrayList availableCars){
       this.availableCars = availableCars;
    }

    public void setSoldCars (List<Car> soldCars){
       this.soldCars = soldCars;
    }

    public void buyCar(String license) {
        // Implement error handling to make sure that the user is inputting a proper license that exists in our Car Dealership
        if(availableCars.size() == 0) {
            System.out.println("Sorry there is no available car");
            //the if statement takes notifies the buyer that there is no available car for sale
        }
       for (int i = 0; i < availableCars.size(); i++) {
           if (license.equals(availableCars.get(i).getLicensePlate())){
               soldCars.add(availableCars.get(i));
               availableCars.remove(i);
               System.out.println("\n Congratulations you have bought " + availableCars.get(i));
           }
       }
        System.out.println("Sorry the car selected is not in our inventory, \n please select from the inventory license plate");


    }
    public void returnCar(String license) {
//   Implement error handling to let the end user know if there’s no more cars for sale, or if they’re trying to return a car, and that car doesn’t exist/no cars have been sold.
       if (soldCars.size() == 0) {
           System.out.println("Sorry no car has been sold \n returned car is not part of inventory");
           // the if statement takes care of soldCars that are not in inventory
       }
        for(int i = 0; i < soldCars.size(); i++) {
            if (license.equals(soldCars.get(i).getLicensePlate())){
                availableCars.add(soldCars.get(i));
                soldCars.remove(i);

                System.out.println("Congratulations you have successfully return " + soldCars.get(i));
                return;
            }
        }
        System.out.println("Sorry the car returned is not part of our inventory sold, \n please re-enter the correct license plate");
        return;//is this necessary
        //how do i fix the exceptions when incorrect license is useriput?

    }
    public void displayInventory() {
       for(int i = 0; i < availableCars.size(); i++) {
           System.out.println(availableCars.get(i));
       }
    }

}
