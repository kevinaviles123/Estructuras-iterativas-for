package com.mycompany.fibonacciconfor;

public class SumaConFor {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma += i;
        }

        System.out.println("La suma de 1 a 10 es: " + suma);
    }
}
