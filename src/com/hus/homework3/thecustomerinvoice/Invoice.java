package com.hus.homework3.thecustomerinvoice;

public class Invoice {
    private int id;
    private Custumer custumer;
    private double amount;

    public Invoice(int id, Custumer custumer, double amount) {
        this.id = id;
        this.custumer = custumer;
        this.amount = amount;
    }

    public int getID() {
        return id;
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public void setCustumer(Custumer custumer) {
        this.custumer = custumer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return custumer.getID();
    }

    public String getCustomerName() {
        return custumer.getName();
    }

    public int getCustomerDiscount() {
        return custumer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * getCustomerDiscount() / 100;
    }

    public String toString() {
        return "Invoice[id = " + id + ", customer = " + getCustomerName() + "(" + getCustomerID() + ")("
                + getCustomerDiscount() + "%), amount = " + amount + "]";

    }
}
