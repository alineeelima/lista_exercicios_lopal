package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double celsius;
        System.out.println("Informe a temperatura em graus celsius: ");
        celsius = entrada.nextDouble();
        double fahrenheint = (celsius * 9/5) + 32;
        System.out.println("A sua temperatura em graus celsius e: " + celsius);
        System.out.println("A sua temperatura em fahrenheits e: " + fahrenheint);
    }
}