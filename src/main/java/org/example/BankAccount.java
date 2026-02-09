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
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isBlocked = isBlocked;
        checkConditions();
    }

    public BankAccount(String ownerName,
                       String accountNumber,
                       boolean isBlocked) {
        this(ownerName, accountNumber, 0, isBlocked);
        checkConditions();
    }

    public BankAccount(String ownerName,
                       double balance,
                       boolean isBlocked) {
        this(ownerName, UUID.randomUUID().toString(), balance, isBlocked);
        checkConditions();
    }

    private void checkConditions() {
        if (ownerName == null || ownerName.isBlank()) {
            throw new RuntimeException("Имя владельца не может быть пустым");
        }
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new RuntimeException("Номер счёт не может быть пустым");
        }
        if (balance < 0) {
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
