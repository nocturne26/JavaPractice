// Chris Pope
// CIS125 - Intro to Programming
// 7-6-26 JAVA Miles to Laps Method
// This assignment was completed by myself without AI intervention. 

package Course;

import java.util.Scanner; //CHANGE: import scanner

public class Pope_MilesToLaps {

    public static double milesToLaps(double milesWalked) {
        final double MILES_PER_LAP = 0.25; // CHANGE: formatted for constant
        double lapsTotal;

        lapsTotal = milesWalked / MILES_PER_LAP;
        return lapsTotal;
    }

    public static void main(String[] args) {

        Scanner sukki = new Scanner(System.in); // CHANGE: started scanner
        System.out.println("Enter miles walked"); // CHANGE: added scanner request

        double lapsNeeded;
        double milesWalked = sukki.nextDouble(); // CHANGE: added scanner return

        //CHANGE: Created if statement to rule out negative miles
        if (milesWalked < 0) {
            System.out.println("Miles walked cannot be negative.");
        } else {
            lapsNeeded = milesToLaps(milesWalked);
            // CHANGE: changed output to Java syntax
            System.out.println("Walking " + milesWalked + " miles will be " + lapsNeeded + " laps.");
        }

        sukki.close(); // CHANGE: closed scanner
    }
}

/*
 * Reflection:
 * I didn't have to make many actual coding or output changes. When converting my pseudocode 
 * to Java, I added a Scanner so the user could enter the number of miles instead of 
 * using a fixed value. Then I added in an if-statement to rule out negative numbers after 
 * that failed during my testing. I also had to use Java syntax such as public static, return, 
 * semicolons, braces, and a method parameter to make the pseudocode work as Java code. There 
 * was minimal cleanup needed for the output. It was just put into the syntax.
 * 
 * sukki = my son's name. He passed away a couple years ago. You'll see his name often.
 */