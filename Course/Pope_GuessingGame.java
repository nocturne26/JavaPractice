   // CIS125 Online
   // Chris Pope 
   // 7-13-26 Java Guessing Game
   // IDE - VS Code
   // Academic Honesty: I attest that this is my original work. I have not 
   // used unauthorized source code, either modified or unmodified.

package Course;

import java.util.Random;
import java.util.Scanner;

public class Pope_GuessingGame {

    public static void printInstructions() {
        System.out.println("Welcome to the game.");
        System.out.println("I am thinking of a number between 1 and 10. Try to guess it.");
    }

    public static int getRandomNumber() {
        Random random = new Random();        
        int num = random.nextInt(10) + 1;        
        return num;
    }

    public static String getHint(int randomGuess, int randomNumber) {
        if (randomGuess > randomNumber) {
            return "Guess too high";
        } else {
            return "Guess too low";
        }
    }

    public static void main(String[] args) {
        Scanner sukki = new Scanner(System.in);
        printInstructions();
        int count = 0;

        int randomNumber = getRandomNumber();

        System.out.println("Please enter your guess (1-10)");
        int randomGuess = sukki.nextInt();
        count ++;

        while(randomGuess != randomNumber) {
            String hint = getHint(randomGuess, randomNumber);
            System.out.println(hint);
            System.out.println("Enter another guess");
            randomGuess = sukki.nextInt();
            count++;
        }

        System.out.println("You got it! You picked " + randomNumber + " on attempt number " + count + ". Good job!");

        sukki.close();
   }
    
}
