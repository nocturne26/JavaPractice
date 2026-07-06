package Intro;

public class MethodNoReturn {
    public static void welcome() {
        System.out.println("Welcome to Java Methods");
        System.out.println("This message is printing from within the welcome method");
    }
    public static void main(String[] args) {
        welcome();
        System.out.println("Back to main method");
    }
}
