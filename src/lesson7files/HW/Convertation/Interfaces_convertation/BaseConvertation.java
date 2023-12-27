package lesson7files.HW.Convertation.Interfaces_convertation;

import lesson7files.HW.Currency;


public interface BaseConvertation {
    void convertBalance(double currentBalance, Currency cardCurrency, Currency targetCurrency);
}