package com.hus.homework6.animal;

public class TestAnimalVer1 {
    public static void main(String[] args) {
        Animal animal = new Cat("Milo");
        animal.greets();

        Animal animal1 = new Dog("poodle");
        Dog dog2 = new Dog("shipa");
        animal1.greets();
        if (animal1 instanceof Dog) {
            Dog dog1 = (Dog) animal1;
            dog1.greets(dog2);
        }

        Animal animal2 = new BigDog("pitbull");
        animal2.greets();
        if (animal2 instanceof BigDog) {
            BigDog bigdog = (BigDog) animal2;
            bigdog.greets(dog2);
        }
    }
}
