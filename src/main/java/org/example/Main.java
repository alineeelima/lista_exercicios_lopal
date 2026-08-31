package org.example;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double raio;
        raio = entrada.nextDouble();
        double area = Math.PI * raio*raio;
        System.out.println("A área do seu círculo é de: " + area);
    }
}