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
                       boolean isBlocked) throws Exception {
        checkConditions();
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    public BankAccount(String ownerName,
                       String accountNumber,
                       boolean isBlocked) throws Exception {
        checkConditions();
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        balance = 0;
        this.isBlocked = isBlocked;
    }

    public BankAccount(String ownerName,
                       double balance,
                       boolean isBlocked) throws Exception {
        this(ownerName, UUID.randomUUID().toString(), balance, isBlocked);
    }

    private void checkConditions() throws Exception {
        if (ownerName.isBlank()) {
            throw new Exception("Имя владельца не может быть пустым");
        }
        if (accountNumber.isBlank()) {
            throw new Exception("Номер счёта не может быть пустым");
        }
        if (balance < 0) {
            throw new Exception("Баланс не может быть отрицательным");
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
