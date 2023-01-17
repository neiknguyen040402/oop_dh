package com.hus.homework3.theauthorbook;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com",'m');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());

        System.out.println(ahTeck);
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author's is: " + dummyBook.getAuthor());

        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com",'m');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Books javaDummy = new Books("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
