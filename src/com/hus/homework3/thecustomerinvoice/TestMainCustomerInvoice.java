package com.hus.homework3.thecustomerinvoice;

public class TestMainCustomerInvoice {
    public static void main(String[] args) {
        Custumer custumer1 = new Custumer(88, "Tan Ah Teck", 10);
        System.out.println(custumer1);

        custumer1.setDiscount(8);
        System.out.println(custumer1);
        System.out.println("id is: " + custumer1.getID());
        System.out.println("name is: " + custumer1.getName());
        System.out.println("discount is : " + custumer1.getDiscount());

        Invoice invoice1 = new Invoice(101, custumer1, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getID());
        System.out.println("customer is: " + invoice1.getCustumer());

        System.out.println("amount is: " + invoice1.getID());
        System.out.println("customer's id is: " + invoice1.getCustomerID());
        System.out.println("customer's name is: " + invoice1.getCustomerName());
        System.out.println("customer's discount is: " +  invoice1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
    }
}
