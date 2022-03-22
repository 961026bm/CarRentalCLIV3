package com.careerdevs;

public class Main {

    public static void main(String[] args) {
    Car one = new Car("toyota", "rav4", 2011);
        System.out.println(one.getMake());
        System.out.println(one.getModel());
        System.out.println(one.getYear());

        Car two = new Car("acura", "mdx", 2020);
        System.out.println(two.getMake());
        System.out.println(two.getModel());
        System.out.println(two.getYear());


    }
}
