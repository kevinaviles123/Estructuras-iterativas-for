package com.mycompany.fibonacciconfor;

public class FibonacciConFor {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print("Serie de Fibonacci: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
        }
    }
}
