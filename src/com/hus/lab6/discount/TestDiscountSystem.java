package com.hus.lab6.discount;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("Donald Trump");
        customer.setMemberType("premium");
        System.out.println(customer);
        Visit visit = new Visit(customer, new Date());
        visit.setProductExpense(2000);
        visit.setServiceExpense(1000);
        System.out.println(visit);
        System.out.println();

        Customer customer1 = new Customer("Micle");
        System.out.println(customer1);
        Visit visit1 = new Visit(customer1, new Date());
        visit1.setProductExpense(400);
        visit1.setServiceExpense(100);
        System.out.println(visit1);

    }
}
