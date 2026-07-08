package Intro;

public class BranchingDemo1 {

    public static void main(String[] args) {

        int age = 75;

        if (age >= 75) {
            System.out.println("Ok Boomer!");
        }
        else if (age >= 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }

        boolean isStudent = false;
        boolean isSenior = age > 60;
        double price = 9.99;

        if(isStudent) {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        }
       
        else {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }
        System.out.println("Total Price: $" + price);
    }
}