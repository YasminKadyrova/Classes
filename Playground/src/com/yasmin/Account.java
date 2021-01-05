package com.yasmin;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String idAccount, String nameAccount){
        this.id=idAccount;
        this.name=nameAccount;
    }

    public Account(String idAccount, String nameAccount,int balanceAccount){
        this.id= idAccount;
        this.name= nameAccount;
        this.balance=balanceAccount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        return balance+amount;
    }

    public int debit(int amount){
        if (amount<=balance)
            balance-=amount;
        else
            System.out.println("amount exceeded");

        return balance;
    }

    public int transferTo(Account acc, int amount){
        if (amount<=balance)
            return acc.balance+=amount;
        else
            System.out.println("amount exceeded");
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
