package lesson7files.HW;

import lesson7files.HW.Users.PremiumUser;
import lesson7files.HW.Users.RegularUser;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти валют
        Currency eurCurrency = new Currency();
        eurCurrency.setValueCode("EUR");
        eurCurrency.setRate(0.85);
        Currency usdCurrency = new Currency();
        usdCurrency.setValueCode("USD");
        usdCurrency.setRate(1.0);


        User regularUser = new User("Rui", "Kamishiro", "ruiWonderX@gmail.com");
        User premiumUser = new User("Heng", "Dan", "danHengAstrExpress@gmail.com");


        BankAccount regAcc = new BankAccount(regularUser, usdCurrency, 10900, 8, 1500);
        BankAccount premAcc= new BankAccount(premiumUser, eurCurrency, 600, 6, 1000);

        //displaying info
        regAcc.displayInfo();
        premAcc.displayInfo();

        regAcc.moneyInto(2000);
        premAcc.moneyInto(100);
        regAcc.displayInfo();
        premAcc.displayInfo();

        regAcc.moneyBack(60);
        premAcc.moneyBack(70);

        //money status after transactions
        regAcc.displayInfo();
        premAcc.displayInfo();

        regAcc.convertBalance(eurCurrency);
        premAcc.convertBalance(usdCurrency);
    }
}
