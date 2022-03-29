package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private String make;
    private String model;
    private int year;

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to autoWorld! \n What is your name?");
        String userInput = scan.nextLine();
        System.out.println("Thank you " + userInput + " this is our inventory");



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

        Dealership dealershipName= new Dealership ("Ben Autos");
        dealershipName.getAvailableCars().add(one);
        dealershipName.getAvailableCars().add(two);
        dealershipName.getAvailableCars().add(three);
        dealershipName.getAvailableCars().add(four);

//        System.out.println(dealershipName.getAvailableCars());
        dealershipName.displayInventory();


    }
}
