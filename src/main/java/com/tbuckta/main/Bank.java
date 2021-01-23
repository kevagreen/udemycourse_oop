package com.tbuckta.main;

public class Bank {
    int accountNumber;
    double balance;
    String name;
    String email;
    long phoneNumber;

    //special call to constructor from another constructor for default values
    public Bank() {

        //guarantees new instance of Bank has default values
        this(233123456, 2.53, "Yolo", "yolo@my.com", 3182220909l);
        System.out.println("empty constructor/default values");
    }

    //constructor
    public Bank(int accountNumber, double balance, String name, String email, long phoneNumber) {
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.name = name;
    }
    //constructor with only name, email, phone
    public Bank(String name, String email, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositTransaction(double amount) {
        this.balance += amount;
    }

    public void withdrawTransaction(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient Funds for withdrawal");
        } else {
            this.balance -= amount;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
