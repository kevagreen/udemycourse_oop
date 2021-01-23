package com.tbuckta.main;

public class VipCustomer {
    String name = "Van Jones";
    double creditLimit = 400_000;
    String email = "vanj@youknow.com";

    //first constructor, 3 params
    public VipCustomer(String name, double creditLimit, String email){
      this.name = name;
      this.creditLimit = creditLimit;
      this.email = email;
    }
    //second constructor, 2 params, one default email
    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        //default email
        this.email = email;
    }
    //empty constructor/calling first constructor
    public VipCustomer(){
        this("Van Jones", 400_000,"vanj@youknow.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
