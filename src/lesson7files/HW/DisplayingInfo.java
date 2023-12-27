package lesson7files.HW;

public class DisplayingInfo {
    public static void displayInfo(BankAccount bankAccount) {
        System.out.println("Card's owner: " + bankAccount.getCardOwner().getName() + " " + bankAccount.getCardOwner().getSurname());

        System.out.println("Balance: " + bankAccount.getCurrentBalance() + " " + bankAccount.getCardCurrency() +
                "\nCurrent Currency Status: " + bankAccount.getCardCurrency().getValueCode());
        System.out.println("Current Rate: " + bankAccount.getRate() + "%" + "\nLimit on credit: " + bankAccount.getLimit() + " " + bankAccount.getCardCurrency().getValueCode());
    }
}
