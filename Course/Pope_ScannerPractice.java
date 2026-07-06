//Chris Pope
//CIS125 Summer 2026
//Pope_ScannerPractice

package Course;

import java.util.Random;
import java.util.Scanner;

public class Pope_ScannerPractice {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sukki = new Scanner(System.in);

        System.out.println("Welcome to the Haunted Hallway Curse Calculator.");
        System.out.println("Enter your name");
        String playerName = sukki.nextLine();

        System.out.println("What haunted room you are starting in?");
        String hauntedRoom = sukki.nextLine();

        System.out.println("Enter your fear level as a decimal (1-100).");
        double fearLevel = sukki.nextDouble();

        System.out.println("On a scale of 1-10, what's the least amount of hauntings you'd like?");
        int minPoints = sukki.nextInt();
        System.out.println("What about the most hauntings you'd like? (1-10)");
        int maxPoints = sukki.nextInt();

        int hauntPoints = random.nextInt(maxPoints - minPoints + 1) + minPoints;

        double curseScore = fearLevel * hauntPoints;

        System.out.println("Hello " + playerName + ".");
        System.out.println("Welcome to the " + hauntedRoom + ".");
        System.out.println("Your fear level is " + fearLevel + ".");
        System.out.println("This room has given you " + hauntPoints + " haunt points.");
        System.out.println("Your final curse score is " + curseScore + ".");
        System.out.println("Thank you for playing the Haunted Hallway Curse Calculator");

        sukki.close();
    }
} 