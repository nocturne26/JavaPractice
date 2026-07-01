package Intro;

public class FollowAlong3 {
     public static void main(String[] args) {
        // Square root of 25
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot); // Output: 5.0

        // 2 raised to the power of 3
        double power = Math.pow(2, 3);
        System.out.println("2 to the power of 3: " + power); // Output: 8.0

        // Rounding 3.14159 to 2 decimal places
        double pi = 3.14159;
        double roundedPi = Math.round(pi * 100.0) / 100.0;
        System.out.println("Rounded Pi (2 decimal places): " + roundedPi); // Output: 3.14

        // Ceiling and Floor examples
        double number = 4.7;
        System.out.println("Ceiling of 4.7: " + Math.ceil(number)); // Output: 5.0
        System.out.println("Floor of 4.7: " + Math.floor(number)); // Output: 4.0
    }
}