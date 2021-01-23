package com.tbuckta.main;

public class Main {
    public static void main(String[] args) {
        //created object Car
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("jop");
        System.out.println(porsche.getModel());

        //bank object created
        Bank account1 = new Bank(148111321, 100_000, "Lortus", "Eva@yes.com", 3185552010l);
        //default constructor values used
        Bank account2 = new Bank();
        System.out.println("default values " + account2.getBalance());
        //can be replaced by constructor
//        account1.setBalance(100_000);
//        System.out.println("Balance " + account1.getBalance());
//        account1.setAccountNumber(148111321);
//        account1.setEmail("Eva@yes.com");
//        account1.setPhoneNumber(3185552010l);
//        account1.depositTransaction(20);
//        account1.withdrawTransaction(223_000);
//        System.out.println("Balance " + account1.getBalance());
        System.out.println(account1.getBalance());

        //VipCustomer object created
        VipCustomer vip = new VipCustomer();
        System.out.println("Our first vip customer is " + vip.getName());
        System.out.println("email: " + vip.getEmail());
        System.out.println("credit limit: " + vip.getCreditLimit());
    }
}
