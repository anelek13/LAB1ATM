package com.snel.anel;

public interface IService {
    double checkBalance(String cardNumber);
    boolean withdraw(double amount, String cardNumber);
    boolean topUp(double amount, String cardNumber);
    void changePinCode(Card card, String newPinCode);
}
