package com.hus.homework5.animals;

public class TestAnimalThemeSubclass {
    public static void main(String[] args) {
        Animal animal = new Cat("moon");
        System.out.println(animal);
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.greets();
        }

        Dog dog1 = new Dog("pitbull");
        Dog dog2 = new Dog("poodle");
        dog1.greets();
        dog1.greets(dog2);
    }
}
