package org.example;

import java.util.UUID;

public class BankAccount {

    private String ownerName;
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public BankAccount(String ownerName,
                       String accountNumber,
                       double balance,
                       boolean isBlocked) {
        checkConditions(ownerName, accountNumber, balance, isBlocked);
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    public BankAccount(String ownerName,
                       String accountNumber,
                       boolean isBlocked)  {
        this(ownerName, accountNumber, 0, isBlocked);
    }

    public BankAccount(String ownerName,
                       double balance,
                       boolean isBlocked){
        this(ownerName, UUID.randomUUID().toString(), balance, isBlocked);
    }

    private void checkConditions(String ownerName, String accountNumber, double balance, boolean isBlocked) {
        if (this.ownerName == null || this.ownerName.isBlank()) {
            throw new RuntimeException("Имя владельца не может быть пустым");
        }
        if (this.accountNumber == null || this.accountNumber.isBlank()) {
            throw new RuntimeException("Номер счёт не может быть пустым");
        }
        if (this.balance < 0) {
            throw new RuntimeException("Баланс не может быть отрицательным");
        }
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
