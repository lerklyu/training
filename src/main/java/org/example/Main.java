package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты конструктора BankAccount")
public class Main {

    @Test
    @DisplayName("Создаёт объект с валидными данными")
    public void createBankAccountWitchValidData() {
        String ownerName = "Алексеев";
        String accountNumber = "2343";
        double balance = 1234.12;
        boolean isBlocked = false;

        BankAccount bankAccount = new BankAccount(ownerName, accountNumber, balance, isBlocked);

        assertEquals("Алексеев", bankAccount.getOwnerName());
        assertEquals("2343", bankAccount.getAccountNumber());
        assertEquals(1234.12, bankAccount.getBalance(), 0);
        assertEquals(false, bankAccount.isBlocked());
    }

    @Test
    @DisplayName("Создаёт объект с минимально допустимым значением баланса")
    public void createBankAccountWitchMinBalanceValidData() {
        String ownerName = "Алексеев";
        String accountNumber = "2343";
        double balance = 0;
        boolean isBlocked = false;

        BankAccount bankAccount = new BankAccount(ownerName, accountNumber, balance, isBlocked);

        assertEquals(0, bankAccount.getBalance(), 0);
    }

    @Test
    @DisplayName("Создаёт объект с пустым именем владельца и проверяет текст ошибки")
    public void createBankAccountWitchOwnerNameIsNull() {
        String ownerName = null;
        String accountNumber = "2343";
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Имя владельца не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создаёт объект с пустой строкой имени владельца и проверяет текст ошибки")
    public void createBankAccountWitchOwnerNameIsBlank() {
        String ownerName = "";
        String accountNumber = "2343";
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Имя владельца не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создаёт объект с пробелом в имени владельца и проверяет текст ошибки")
    public void createBankAccountWitchOwnerNameIsBlankWitchSpace() {
        String ownerName = " ";
        String accountNumber = "2343";
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Имя владельца не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создаёт объект с пустым номером счёта и проверяет текст ошибки")
    public void createBankAccountWitchAccountNumberIsNull() {
        String ownerName = "Габардинов";
        String accountNumber = null;
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Номер счёт не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создаёт объект с пустой строкой номера счёта")
    public void createBankAccountWitchAccountNumberIsBlank() {
        assertThrows(NullPointerException.class,
                () -> new BankAccount("Габардинов", "", 0, true));
    }

    @Test
    @DisplayName("Создаёт объект с пустой строкой номера счёта и проверяет текст ошибки")
    public void createBankAccountWitchAccountNumberIsBlankAndExceptionMessage() {
        String ownerName = "Габардинов";
        String accountNumber = "";
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Номер счёт не может быть пустым", exception.getMessage());
    }


    @Test
    @DisplayName("Создаёт объект с с пробелом в номерe счёта и проверяет текст ошибки")
    public void createBankAccountWitchAccountNumberIsBlankWitchSpace() {
        String ownerName = "Габардинов";
        String accountNumber = " ";
        double balance = 5000;
        boolean isBlocked = false;

        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Номер счёт не может быть пустым", exception.getMessage());
    }

    @Test
    @DisplayName("Создаёт объект с отрицательным значением баланса и проверяет текст ошибки")
    public void createBankAccountWitchBalanceIsNegative() {
        String ownerName = "Габардинов";
        String accountNumber = "12331";
        double balance = -0.01;
        boolean isBlocked = false;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new BankAccount(ownerName, accountNumber, balance, isBlocked));

        assertEquals("Баланс не может быть отрицательным", exception.getMessage());
    }

    @Test
    @DisplayName("Созданный объект не равен null")
    public void shouldCreateNonNullObject() {
        BankAccount bankAccount = new BankAccount(
                "Капутов",
                "12344",
                12323.00,
                false);

        assertNotNull(bankAccount);
    }

    @Test
    @DisplayName("Имя владельца сохраняется точно как передано")
    public void shouldPreserveNameExactlyAsPassed() {
        BankAccount bankAccount = new BankAccount(
                " Капутов ",
                "12344",
                1234.00,
                false);

        assertEquals(" Капутов ", bankAccount.getOwnerName());
    }
}
