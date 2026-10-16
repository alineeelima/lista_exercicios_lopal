package org.example;
public class Main {
    static void main() {
        double f = converterCelsiusFahrenheit(35);
        System.out.println("Esse número em Fahrenheit é igual a: "+f+"°F");
    }
    static double converterCelsiusFahrenheit(double c){
        return c * 1.8 + 32;
    }
}










