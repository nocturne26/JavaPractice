package Course;

public class Pope_MathFunctions {
    // Chris Pope
    // CIS125 - Intro to Programming
    // 6-30-26 Java Math Functions Assignment
    
    // YES I KNOW IT'S LATE, I'M STILL GOING TO DO IT :(
    public static void main(String[] args) {
        double num1 = 5.3;
        double num2 = 8.9;
        int resultA = 0;
        double resultB = 0.0;
        System.out.println("Performing math functions with " + num1);
        System.out.println(String.valueOf('*').repeat(30));

        // round function
        resultA = (int) Math.round(num1);
        System.out.println("round: " + resultA);
        System.out.println(String.valueOf('*').repeat(30));

        // square root function
        resultB = Math.sqrt(122);
        System.out.println("The square root of 9 is " + resultB);

        // power function
        resultB = Math.pow(9, 3);
        System.out.println("9 to the 3rd power is " + resultB);

        // ceil function
        resultB = Math.ceil(num1);
        System.out.println("The next whole number to " + num1 + " is " + resultB);

        // floor function
        resultB = Math.floor(num2);
        System.out.println("The previous whole number to " + num2 + " is " + resultB);
    }
}
//* We included some fancy formatting in this output *\
//* Can you figure out how we did it?