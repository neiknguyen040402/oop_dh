package com.hus.homework2;

public class FactorialFibonacciRecusive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialUsingFor(5));
        System.out.println(fibonacci(5));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int factorialUsingFor(int number) {
        int fact = 1;
        if (number == 0 || number == 1) {
            return fact;
        } else {
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    //giai thừa dùng theo phương pháp đệ quy sử dụng nhiều tài nguyên tính toán và lưu trữ hơn, và nó cần phải lưu
//các trạng thái hiện tại của nó trước mỗi lần gọi đệ quy liên tiếp
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + factorial(number - 2);
        }
    }
}