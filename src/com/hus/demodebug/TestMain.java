package com.hus.demodebug;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("kien");

        TestMain main = new TestMain();
        List<Student> list = main.readFile();
        for (Student stu : list) {
            System.out.println(stu);
        }

    }

    public List<Student> readFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader file = new FileReader("newfile.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }

                line = line.replaceAll("; + \\s+", ";");

                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name, age, mark));
            }

        } catch (Exception e) {

        }
        return list;
    }
}


