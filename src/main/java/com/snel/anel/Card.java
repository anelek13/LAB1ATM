package com.snel.anel;

public class Card {
    private String cardNumber;
    private String pinCode;
    private AccountOfClients accountOfClients;


    public Card() {}

    public Card(String cardNumber, String pinCode, AccountOfClients accountOfClients) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.accountOfClients = accountOfClients;
    }

    // Setters
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setAccount(AccountOfClients accountOfClients) {
        this.accountOfClients = accountOfClients;
    }

    // Getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public AccountOfClients getAccount() {
        return accountOfClients;
    }

    @Override
    public String toString() {
        return "Card [ " +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", account=" + accountOfClients +
                " ]";
    }
}
