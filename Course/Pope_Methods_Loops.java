// CIS125 Online
// Chris Pope 
// 7-13-26 Java Methods Mania 2 with Loops
// IDE - VS Code
// Academic Honesty: I attest that this is my original work. I have not 
// used unauthorized source code, either modified or unmodified.

/* 
I intentionally chose the "difficult" coding choices because I enjoy
pushing myself to see what I can do. These were hard.  The hardest part I
have with these assignments is figuring out what I'm trying to solve. It takes
me a long time, but I start with just writing basic psuedocode in first, 
and grasp the concept of what I'm trying to achieve, and then I keep fine
tuning it until it's completed. This can take me hours to do, but in the 
end, I learned something hard.  I'll take that.
*/


package Course;

import java.util.Scanner;

public class Pope_Methods_Loops {

    //I chose a for loop because the string length is known. This loop has a 
    //known end.
    public static int countVowels(String text) {
        int vowelCount = 0;
        int stringLength = text.length();

        for (int i = 0; i < stringLength; i++) {

            char stringChar = text.toLowerCase().charAt(i);

            if (stringChar == 'a' || stringChar == 'e' || stringChar == 'i' || stringChar == 'o' || stringChar == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    //I chose a while loop because it didn't have a definite end to the loop.
    //it just goes while the condition is true.
    public static String computeYearsToTarget(double principal, double rate, double target) {
        String balance = "";
        double annualAmount = principal;
        final double RATE_CONVERTER = 100.0;
        int years = 0;

        while (annualAmount < target) {

            annualAmount = Math.round((annualAmount + (annualAmount * (rate / RATE_CONVERTER))) * 100.0) / 100.0;

            years++;
        }

        balance = years + ":" + annualAmount;
        return balance;
    }


    //I chose a for loop because .length() will tell me how many characters are 
    //in a String. There will be a known end.
    public static String runLengthEncode(String code) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int count = 1;
        int codeLength = code.length();
        char referenceChar = code.charAt(i - 1);

        for (i = 1; i < codeLength; i++) {

            char currentChar = code.charAt(i);

            if (currentChar == referenceChar) {

                count++;

            } else {
                if (count > 1) {

                    sb.append(count);
                    sb.append(referenceChar);

                } else {
                    sb.append(referenceChar);

                }
                count = 1;
                referenceChar = currentChar;
            }

        }

        if (count > 1) {

            sb.append(count);
            sb.append(referenceChar);

        } else {
            sb.append(referenceChar);

        }

        if (sb.length() < code.length()) {

            return sb.toString();

        } else {

            return code;

        }

    }

    public static void main(String[] args) {
        Scanner sukki = new Scanner(System.in);

        // DIFFICULT - #10: Vowel Counter
        System.out.println("Enter a word to see the number of vowels.");
        String text = sukki.nextLine();

        int vowelCount = countVowels(text);

        System.out.println("Your word " + text + " has " + vowelCount + " vowels!");

        // DIFFICULT - #11: Compound Interest Calculator
        System.out.println("What is your starting balance?");
        double principalAmount = sukki.nextDouble();

        System.out.println("What is your target balance?");
        double targetBalance = sukki.nextDouble();

        System.out.println("What is your annual percentage rate (APR)?");
        double currentRate = sukki.nextDouble();
        sukki.nextLine();

        if (currentRate <= 0.0) {

            System.out.println("Invalid rate");

        } else {

            String finalBalance = computeYearsToTarget(principalAmount, currentRate, targetBalance);

            System.out.println("Your final years:balance is: " + finalBalance);
        }

        // DIFFICULT - #13: Run-Length Encoder
        System.out.println("Enter code");
        String code = sukki.nextLine();

        String compressedCode = runLengthEncode(code);

        System.out.println("Your encoded code is :" + compressedCode);

        sukki.close();
    }

}