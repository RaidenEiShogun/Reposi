package lesson7files.HW;

import lesson7files.HW.Interfaces.UserType;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {


    public BankAccount(User cardOwner, Currency cardCurrency, double currentBalance, double rate, double limit) {

        this.cardOwner = cardOwner;
        this.cardCurrency = cardCurrency;
        this.currentBalance = currentBalance;
        this.rate = rate;
        this.limit = limit;
    }
    private User cardOwner;
    private Currency cardCurrency;

    public User getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(User cardOwner) {
        this.cardOwner = cardOwner;
    }

    public Currency getCardCurrency() {
        return cardCurrency;
    }

    public void setCardCurrency(Currency cardCurrency) {
        this.cardCurrency = cardCurrency;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    private double currentBalance;
    private double rate;
    private double limit;

    //зняти гроші
    public void moneyBack(double money){
        if( (limit+currentBalance)>=money){
            currentBalance-=money;
            System.out.println(money + " " + cardCurrency.getValueCode()
                    + " - ur old balance. New balance: " + currentBalance + " " + cardCurrency.getValueCode());

        }
        else
        {
            System.out.println("Smthing went wrong, check ur balance");
        }
    }
    //покласти гроши
    public void moneyInto(double money){
        currentBalance+=money;
        System.out.println("Ur balance: "+ currentBalance + " "+ cardCurrency.getValueCode());
    }
    //инфо показати
    public void displayInfo() {
        System.out.println("Card's owner: " + cardOwner.getName() + " " + cardOwner.getSurname());

        if (cardOwner instanceof User) {
            System.out.println("Account Status: User does not implement UserType");
        } else if (cardOwner instanceof UserType) {
            System.out.println("Account Status: " + ((UserType) cardOwner).getUserStatus());
        } else {
            System.out.println("Account Status: N/A");
        }

        System.out.println("Balance: " + currentBalance + " " + cardCurrency.getValueCode() +
                "\nCurrent Currency Status: " + cardCurrency.getValueCode());
        System.out.println("Current Rate: " + rate + "%" + "\nLimit on credit: " + limit + " " + cardCurrency.getValueCode());
    }
    //конверtuvaty
    public void convertBalance(Currency currency) {
        BigDecimal convertedBalance = BigDecimal.valueOf(currentBalance)
                .multiply(BigDecimal.valueOf(currency.getRate()).divide(BigDecimal.valueOf(cardCurrency.getRate()), 2, RoundingMode.HALF_UP));
        System.out.println("Balance converted to " + currency.getValueCode() + ": " + convertedBalance);
    }
}
