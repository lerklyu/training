package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            BankAccount user1 = new BankAccount(
                    "Антонов В. В.",
                    "2100 2244 2444",
                    -15000.50,
                    false);

            BankAccount user2 = new BankAccount(
                    "Федотов А. И.",
                    "2201 1234 5422",
                    true);

            BankAccount user3 = new BankAccount(
                    "Степнов А. А.",
                    -130000.00,
                    false);

            BankAccount userNull = new BankAccount(
                    " ",
                    null,
                    123,
                    false);

            List<BankAccount> bankDataBase = new ArrayList<>();

            bankDataBase.add(user1);
            bankDataBase.add(user2);
            bankDataBase.add(user3);
            bankDataBase.add(userNull);

            for (BankAccount bankAccount : bankDataBase) {
                System.out.println(bankAccount.toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}