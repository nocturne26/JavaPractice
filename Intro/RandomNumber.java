package Intro;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        // Generate random whole number 0-9
        int num1 = random.nextInt(10) + 1;

        // Generate random decimal 0.0-1.0
        double decimal = random.nextDouble() * 100;

        // Generate random coin flip True-False
        boolean coinFlip = random.nextBoolean();

        //Followed a video from Bro Code (insert eyeroll emoji)
        int x = random.nextInt(6) + 1;
        double y = random.nextDouble() * 100;
        boolean z = random.nextBoolean(); 

        // Example of MIN and MAX as integers
        int healthPoints = 0;
        final int MIN1 = 30;
        final int MAX1 = 80;
        healthPoints = random.nextInt(MAX1 - MIN1 + 1) + MIN1;

        // Example of MIN and MAX as doubles
        final double MIN2 = 3.5;
        final double MAX2 = 12;
        double range = MAX2 - MIN2;
        double interestRate = 0.0;
        interestRate = MIN2 + (random.nextDouble() * range);

        //Just to keep everything here together, and make others question my choices
        System.out.println("Pet Happiness Score: " + num1 + "/10");
        System.out.println("Chance of rain is " + decimal + " percent");
        System.out.println("Heads? " + coinFlip);
        System.out.println("Roll the dice: " + x);
        System.out.println("Your aim accuracy is at " + y + "%");
        System.out.println("Are you awake? " + z);
        System.out.println("You have earned " + healthPoints + " health points!");
        System.out.println("Your interest rate is " + interestRate + "%");
    }    
}