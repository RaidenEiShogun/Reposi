package lesson7files.HW;

import lesson7files.HW.Convertation.Convertation;

public class Main  {
    public static void main(String[] args) {

    Currency eurCurrency = new Currency();
    eurCurrency.setValueCode("EUR");
    eurCurrency.setRate(0.85);

    Currency usdCurrency = new Currency();
    usdCurrency.setValueCode("USD");
    usdCurrency.setRate(1.0);

    User regularUser = new User("Rui", "Kamishiro", "ruiWonderX@gmail.com");
    User premiumUser = new User("Heng", "Dan", "danHengAstrExpress@gmail.com");

    BankAccount regAcc = new BankAccount(regularUser, usdCurrency, 10900.0, 8.0, 1500.0, new Convertation());
    BankAccount premAcc = new BankAccount(premiumUser, eurCurrency, 600.0, 6.0, 1000.0, new Convertation());

    // Displaying info
    regAcc.displayInfo();
    premAcc.displayInfo();

    // Depositing money
    regAcc.moneyInto(2000.0);
    premAcc.moneyInto(100.0);
    regAcc.displayInfo();
    premAcc.displayInfo();

    // Withdrawing money
    regAcc.moneyBack(60.0);
    premAcc.moneyBack(70.0);

    // Displaying money status after transactions
    regAcc.displayInfo();
    premAcc.displayInfo();

    // Converting balances
    regAcc.convertBalance(eurCurrency);
    premAcc.convertBalance(usdCurrency);
    }
}
