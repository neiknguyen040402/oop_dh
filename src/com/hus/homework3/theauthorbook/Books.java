package com.hus.homework3.theauthorbook;

public class Books {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Books(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Books(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String st = new String();
        st = "Books[name = " + name + ", authors = {Author";
        for (int i = 0; i < authors.length; i++) {
            st += "[name = " + authors[i].getName() + ", email = " + authors[i].getEmail() + ", gender = " + authors[i].getGender() + "], ";
        }
        st = st + "}, price = " + price + ", qty = " + qty + "]";
        return st;
    }

    public String getAuthorNames() {
        String str = new String();
        str = str + authors[0];
        for (int i = 1; i < authors.length; i++) {
            str = str + "," + authors[i];
        }
        return str;
    }
}
