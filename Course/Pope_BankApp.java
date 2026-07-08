// Chris Pope
// CIS125 - Intro to Programming
// 7-6-26 Java Method argument

package Course;

public class Pope_BankApp {

    public static void displayAccountDetails(String accountName, double accountBalance) {
        System.out.println("Account name: " + accountName + ", Current Balance: " + accountBalance);
    }

    public static void processWithdrawal(double accountBalance, double withdrawalAmount) {
        double remainingBalance = accountBalance - withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount + " will occur if sufficient funds are available");
        if (withdrawalAmount <= accountBalance) {
            System.out.println(
                    "Withdrawal of $" + withdrawalAmount + " successful. Remaining Balance: $" + remainingBalance);
        } else {
            System.out.println("Insufficient funds! Your current balance is $" + accountBalance);
        }
    }

    public static void main(String[] args) {
        String accountName = "John Doe";
        double accountBalance = 500.0;
        double withdrawalAmount = 700.0;

        displayAccountDetails(accountName, accountBalance);
        processWithdrawal(accountBalance, withdrawalAmount);
    }
}
