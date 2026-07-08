// Chris Pope
// CIS125 -  Intro to Programming
// 7-6-26 Java Void method


package Course;

public class Pope_CyberSecurityApp {
    public static void displayAlert() {
        System.out.println("ALERT: Suspicious login attempt detected!");
    }

    public static void displayTip() {
        System.out.println("TIP: Always use strong and unique passwords for each account.");
    }    
    public static void main(String[] args) {
        
        displayAlert();
        displayTip();
    }

}
