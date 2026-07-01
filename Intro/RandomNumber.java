package Intro;

import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        // Generate random whole number 0-9
        int num1 = random.nextInt(10);

        // Generate random decimal 0.0-1.0
        double decimal = random.nextDouble() * 100;

        // Generate random coin flip True-False
        boolean coinFlip = random.nextBoolean();

        System.out.println("Pet Happiness Score: " + num1 + "/10");
        System.out.println("Chance of rain is " + decimal + " percent");
        System.out.println("Heads? " + coinFlip);
    }    
}