package lesson7files.HW;
import lesson7files.HW.Convertation.Convertation;

public class BankAccount {

    private User cardOwner;
    private Currency cardCurrency;
    private double currentBalance;
    private double rate;
    private double limit;
    private Convertation convertation;

    public BankAccount(User cardOwner, Currency cardCurrency, double currentBalance, double rate, double limit, Convertation convertation) {
        this.cardOwner = cardOwner;
        this.cardCurrency = cardCurrency;
        this.currentBalance = currentBalance;
        this.rate = rate;
        this.limit = limit;
        this.convertation = convertation;
    }

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

    //зняти гроші
    public boolean moneyBack(double money){
        if( (isMoneyBackValid(money))){
            doMoneyBack(money);
            System.out.println(money + " " + cardCurrency.getValueCode()
                    + " - ur old balance. New balance: " + currentBalance + " " + cardCurrency.getValueCode());
                  return true;
        }
        else
        {
            System.out.println("Smthing went wrong, check ur balance");
            return false;
        }
    }

    public boolean isMoneyBackValid(double money){
        return (limit+currentBalance)>=money;
    }
    public void doMoneyBack(double money){
        currentBalance -=money;
    }

    //покласти гроши
    public void moneyInto(double money){
        doMoneyInto(money);
        System.out.println("Ur balance: "+ currentBalance + " "+ cardCurrency.getValueCode());
    }

    private void doMoneyInto(double money) {
        currentBalance += money;
    }

    public void displayInfo() {
        DisplayingInfo.displayInfo(this);
    }

    public void convertBalance(Currency currency) {
        convertation.convertBalance(this, currency);
    }


}
