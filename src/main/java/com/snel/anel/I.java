package com.snel.anel;

import java.util.ArrayList;

public class I implements IService {
    private ArrayList<AccountOfClients> accountOfClients;
    private ArrayList<Card> cards;
    private ArrayList<Consumer> users;

    public I() {}

    // Setters
    public void setAccounts(ArrayList<AccountOfClients> accountOfClients) {
        this.accountOfClients = accountOfClients;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setUsers(ArrayList<Consumer> users) {
        this.users = users;
    }

    // Getters
    public ArrayList<AccountOfClients> getAccounts() {
        return accountOfClients;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public ArrayList<Consumer> getUsers() {
        return users;
    }

    // Methods
    boolean checkCardInfo(String cardNumber, String pinCode) {
       for (Card card : cards) {
           if (cardNumber.equals(card.getCardNumber()) && pinCode.equals(card.getPinCode())) {
               return true;
           }
       }
       return false;
    }

    public Card getCard(String cardNumber) {
        for (Card card : cards) {
            if (cardNumber.equals(card.getCardNumber())) {
                return card;
            }
        }
        return null;
    }

    // BankService methods
    @Override
    public double checkBalance(String cardNumber) {
        Card card = getCard(cardNumber);

        return card == null ? 0 : card.getAccount().getBalance();
    }

    @Override
    public boolean withdraw(double amount, String cardNumber) {
        Card card = getCard(cardNumber);

        if (card == null || card.getAccount().getBalance() - amount < 0) {
            return false;
        }

        card.getAccount().doWithdrawBalance(amount);
        return true;
    }

    @Override
    public boolean topUp(double amount, String cardNumber) {
        Card card = getCard(cardNumber);

        if (card == null) {
            return false;
        }

        card.getAccount().doTopUpBalance(amount);
        return true;
    }

    @Override
    public void changePinCode(Card card, String newPinCode) {
        card.setPinCode(newPinCode);
    }

    // Method toString

    @Override
    public String toString() {
        return "Bank [" +
                "users=" + users +
                ", cards=" + cards +
                ", accounts=" + accountOfClients +
                " ]";
    }
}
