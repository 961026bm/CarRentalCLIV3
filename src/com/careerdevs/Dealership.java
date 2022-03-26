package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String autoWorld;
    private List<Car> availableCars;
    private List<Car> soldCars;

   public Dealership(String autoWorld){
       this.autoWorld = autoWorld;
       this.availableCars = new ArrayList<>();
       this.soldCars = new ArrayList<>();
   }

   public String getAutoWorld(){
       return autoWorld;
    }

    public List<Car> getAvailableCars(){
       return availableCars;
    }

    public List<Car> getSoldCars () {
       return soldCars;
    }

    public void setAutoWorld(String autoWorld) {
        this.autoWorld = autoWorld;
    }

    public void setAvailableCars(ArrayList availableCars){
       this.availableCars = availableCars;
    }

    public void setSoldCars (List<Car> soldCars){
       this.soldCars = soldCars;
    }

    public static void buyCar(String license) {
       for (int availableCars = 0; availableCars < 0; availableCars++) {
         //  if (availableCars == )
               //soldCars.push

       }
    }
}
