package com.hus.homework3.thecustomeraccount;

public class TestMainCustomerAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(10, "nguyen kien", 'm');
        Account account = new Account(44, customer, 999.94739);

        System.out.println(account);
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println(account.deposit(100));
        System.out.println(account.withdraw(99));
        System.out.println(account.withdraw(99999));
    }
}

