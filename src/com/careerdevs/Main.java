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



    Car one = new Car("toyota", "rav4", 2011, "mb105");
//        System.out.println(one.getMake());
//        System.out.println(one.getModel());
//        System.out.println(one.getYear());
//
        Car two = new Car("acura", "mdx", 2020, "cd919");
//        System.out.println(two.getMake());
//        System.out.println(two.getModel());
//        System.out.println(two.getYear());

        System.out.println(one.toString());
        System.out.println(two.toString());


    }
//    public static buyCar(String license) {
//
//    }
}
