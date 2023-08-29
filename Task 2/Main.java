package Task2;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(userAccount);

        System.out.println("Welcome to the ATM!");
        atm.processOption();
    }
}