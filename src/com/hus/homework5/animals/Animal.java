package com.hus.homework5.animals;

public class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name = " + name + "]";
    }
}
