package Intro;

import java.util.Scanner; // import scanner class

public class Scanners {    
    public static void main(String[] args) {

        Scanner myObj = new Scanner (System.in); //create scanner object
        System.out.println("Enter Username");

        String userName = myObj.nextLine(); // method to read user input
        System.out.println("My Username is " + userName); // output user input

        String word = "";
        String sentence = "";

        System.out.println("Enter a word");
        word = myObj.next();
        System.out.println("Enter a sentence");
        myObj.nextLine(); // clear the input string
        sentence = myObj.nextLine();
        System.out.println("The word " + word);
        System.out.println("The sentence " + sentence);

        final int NUMERIC_SENTINEL = -1; //constant
        int aNumber = 0;

        // prime the loop
        System.out.println("Enter your favorite number. (Enter -1 to quit)");
        aNumber = myObj.nextInt();
        while (aNumber != NUMERIC_SENTINEL) { //Test the loop condition
            System.out.println("You said your favorite number was: " + aNumber);
            System.out.println("Enter your favorite number again. (Enter -1 to quit)");
            aNumber = myObj.nextInt(); // update your loop control variable        
        }
        System.out.println("End of program. Have a nice day!");

        double deposit = 0.0;

        System.out.println("Enter your last 5 bank deposits.");
        for (int depositCount = 1; depositCount<=5; depositCount++) {
            System.out.print("Amount for deposit " + depositCount + ": ");
            deposit = myObj.nextDouble();
            System.out.println("Verification: You entered $" + deposit);
            System.out.println("End of code. Have a great day!");
        }

        myObj.close();
    }    
}