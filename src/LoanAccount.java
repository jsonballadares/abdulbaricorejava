package src;

public class LoanAccount extends Account {
    public LoanAccount(String accountNumber, String name, String address, String phoneNumber, String dateOfBirth) {
        super(accountNumber, name, address, phoneNumber, dateOfBirth);
    }

    public void payEMI(double amt) {
        this.setBalance(this.getBalance() - amt);
    }

    public void repay(double amt) {
        if (this.getBalance() == amt)
            this.setBalance(0);
    }
}
