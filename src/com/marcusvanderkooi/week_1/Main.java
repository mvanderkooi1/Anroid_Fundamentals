package com.marcusvanderkooi.week_1;

public class Main {

    public static void main(String[] args) {
        //create string
        String cityName = "Columbus";

        //variables
        int zipCode = 43215;
        int [] highTemps = {32, 25, 27, 40, 45};

        //calculate average
        double average = (highTemps[0] + highTemps[1]
                + highTemps[2] + highTemps[3]
                + highTemps[4]) / 5.0;

        //output code
        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average high: " + average);
    }
}
