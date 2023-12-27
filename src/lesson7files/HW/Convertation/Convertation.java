package lesson7files.HW.Convertation;


import lesson7files.HW.BankAccount;
import lesson7files.HW.Currency;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Convertation {
    public void convertBalance(BankAccount bankAccount, Currency targetCurrency) {
        double currentBalance = bankAccount.getCurrentBalance();
        Currency sourceCurrency = bankAccount.getCardCurrency();

        BigDecimal convertedBalance = BigDecimal.valueOf(currentBalance)
                .multiply(BigDecimal.valueOf(targetCurrency.getRate()).divide(BigDecimal.valueOf(sourceCurrency.getRate()), 2, RoundingMode.HALF_UP));

        System.out.println("Balance converted from " + sourceCurrency.getValueCode() + " to " + targetCurrency.getValueCode() + ": " + convertedBalance);
    }
}