package Intro;

public class MethodDemoParameters {
    public static void welcomeMessage(String name) {
        System.out.println("Welcome to our class " + name);
    }

    public static void coffeeTempWarning(double coffeeTemperature) {
        System.out.println("Your coffee Temperature is " + coffeeTemperature + " degrees");
        System.out.println("If over 160 degrees it may burn your tongue - be careful!");
    }

    public static void lowBalanceWarning(double balance, int lowBalanceThreshold) {
        System.out.println("Your balance is " + balance);
        System.out.println("Your low balance threshold is " + lowBalanceThreshold);
        System.out.println("You determine if you need to add more money");
    }

    public static void main(String[] args) {
        welcomeMessage("Billy Bob");
        coffeeTempWarning(150);
        lowBalanceWarning(1534.04, 200);
     }
}