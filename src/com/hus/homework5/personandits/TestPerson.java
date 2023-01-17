package com.hus.homework5.personandits;

public class TestPerson {
    public static void main(String[] args) {
        Student newStudent = new Student("minh", "hoabinh", "khdl", 2, 75.5);
        System.out.println(newStudent.getName());

        Person person = new Student("kien", "haiduong", "khdl", 2, 75.5);
        System.out.println(person);

        Person person1 = new Staff("hai", "hanoi", "khtn", 100.5);
        System.out.println(person1);

        if (person instanceof Student) {          //downcasting
            Student student = (Student) person;
            student.setFee(80);
            System.out.println(student);
        }
    }
}
