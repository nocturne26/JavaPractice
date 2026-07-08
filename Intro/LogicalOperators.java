package Intro;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        // && = and operator - both conditions are true
        // || = or operator - either conditions are true
        // ! = not operator - neither conditions are true

        Scanner sukki = new Scanner(System.in);
        // && Operator
        // System.out.println("Enter temp");
        // int temp = sukki.nextInt();

        // if (temp > 30) {
        // System.out.println("It's hot outside");
        // }

        // else if (temp >= 20 && temp <= 30) {
        // System.out.println("It is warm outside");
        // }

        // else {
        // System.out.println("It is cold outside");
        // }

        // || Operator
        System.out.println("You are playing a game. Press q or Q to quit");
        String response = sukki.next();

        // if(response.equals("q") || response.equals("Q")) {
        // System.out.println("You quit the game");
        // }

        // else {
        // System.out.println("You are still playing the game. *pew pew*");
        // }

        // ! Operator

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game. *pew pew*");
        }

        else {
           System.out.println("You quit the game"); 
        }

        sukki.close();
    }
}
