package com.hus.lab6.discount;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        customer = new Customer(name);
        this.date = date;
    }

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense - (DiscountRate.getServiceDiscountRate(customer.getMemberType()) * serviceExpense);
    }

    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense - (DiscountRate.getProductDiscountRate(customer.getMemberType()) * productExpense);
    }

    public void setProductExpense(double ex) {
        productExpense = ex;
    }

    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {
        return "Visit: " + customer.getName() + ", Date: " + date + ", product expenses: " + this.getProductExpense()
                + ", service expenses: " + this.getServiceExpense() + ", total expenses= " + this.getTotalExpense();
    }
}
