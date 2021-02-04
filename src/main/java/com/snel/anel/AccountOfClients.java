package com.snel.anel;

public class AccountOfClients {
    private String accountNumber;
    private Double balance;

 

    public AccountOfClients(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    // Methods
    public void doTopUpBalance(double amount) {
        balance += amount;
    }

    public void doWithdrawBalance(double amount) {
        balance -= amount;
    }


    @Override
    public String toString() {
        return "Account [ " +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                " ]";
    }
}
