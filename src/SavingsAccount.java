package src;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, String name, String address, String phoneNumber, String dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
    }
}
