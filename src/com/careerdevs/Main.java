package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private String make;
    private String model;
    private int year;
// Implement a while(true) loop to have on-going logic that will prompt the user to either buy or return a car. This should allow users to select options to (1) Buy a Car, (2) Return a car, or (3) Leave the dealership, and for this one, selecting 3 will exit the program.
//Within each of these options, you’ll use the scanner class to read user input and have the user return or buy the car they want.
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Ben Autos! \n What is your name?");
        String user = scan.nextLine();

        while (user == "") {
            System.out.println("Thank you " + user + "please choose an option below \n (1) Buy a Car \n (2) Return a Car \n (3) Exit the program");
            String userInput = scan.nextLine();
        } if (user == "Buy a Car"){
            System.out.println("Thank you " + user + " this is our inventory\n ");
        } else

       System.out.println("Thank you " + user + " this is our inventory\n ");



    Car one = new Car("toyota", "rav4", 2011, "tr105");
//        System.out.print(one.getMake());
//        System.out.print(one.getModel());
//        System.out.print(one.getYear());

        Car two = new Car("acura", "mdx", 2020, "am919");
//        System.out.println(two.getMake());
//        System.out.println(two.getModel());
//        System.out.println(two.getYear());

//        System.out.println(one.toString());
//        System.out.println(two);

        Car three = new Car("lexus", "rx350", 2017, "lx234");
        Car four = new Car("honda", "accord", 2008, "ha195");

        Dealership dealershipName = new Dealership ("Ben Autos");
        dealershipName.getAvailableCars().add(one);
        dealershipName.getAvailableCars().add(two);
        dealershipName.getAvailableCars().add(three);
        dealershipName.getAvailableCars().add(four);

//        System.out.println(dealershipName.getAvailableCars());
        dealershipName.displayInventory();

        System.out.println("\n What car would you want to buy? \n You can specify with just the license plate");
        String userInput1 = scan.nextLine();

        // need to output Thanks you have bought (userInput1) car selection
        dealershipName.buyCar(userInput1);
        System.out.println("\n Thanks for patronizing " + dealershipName.getDealershipName() + " you just bought " + dealershipName.getSoldCars().get(0));




    }
}
