package src;

public class Account {
    private String accountNumber;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Account(String accountNumber, String name, String address, String phoneNumber, String dateOfBirth) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
