package org.example;
public class Main {
    static void main() {
        float valorFloat = 2.7f;
        long valorLong = (long) valorFloat;
        double valorDouble = valorLong;
        int valorInt = (int) valorDouble;
        System.out.println("Valor do float: " + valorFloat);
        System.out.println("Valor do long: " + valorLong);
        System.out.println("Valor do double: " + valorDouble);
    }
}