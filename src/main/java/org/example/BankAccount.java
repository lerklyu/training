package org.example;

public class BankAccount {

    private String ownerName;
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public BankAccount(String ownerName,
                       String accountNumber,
                       double balance,
                       boolean isBlocked) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
