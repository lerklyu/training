package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount(
                "Антонов В. В.",
                "2100 2244 2444",
                15000.50,
                false);

        BankAccount user2 = new BankAccount(
                "Горшков А. И.",
                "2201 1234 5422",
                0.00,
                true);

        BankAccount user3 = new BankAccount(
                "Степнов А. А.",
                "2200 2543 9685",
                130000.00,
                false);

        List<BankAccount> bankDataBase = new ArrayList<>();

        bankDataBase.add(user1);
        bankDataBase.add(user2);
        bankDataBase.add(user3);

        for (BankAccount bankAccount : bankDataBase) {
            System.out.println(bankAccount.toString());
        }
    }
}