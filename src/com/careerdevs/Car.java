package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private int year;
    private String licensePlate;

    public Car(String make, String model, int year, String licensePlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString() {
        return make + '\'' + model + '\'' + year + licensePlate + '\'';
    }
}

/* traditional array declaration and initialize
String[] friendsArray = {"Bunmi", "Marcus", "Rodney", "John"}
to access 2nd index you will
System.out.println(friendsArray[1]);
to print the all the indexes
System.out.println(friendsArray.length)
you can't add to Traditional Arrray that makes it Immutable

ArrayList<String> friendsArrrayList = new ArrayList<>(Arrays.asList("Bunmi", "Marcus", "Rodney", "John")
to access 2nd index you will
System.out.println(friendsArrayList.get(1));
to print the all the indexes
System.out.println(friendsArrayList.size());
ArrayList is mutable as in you can add to it
friendsArrayList.add("Gabe");
System.out.println(friendsArrayList.get(4));
* */
