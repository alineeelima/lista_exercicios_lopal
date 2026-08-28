package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        System.out.println("Informe o tamanho do lado do seu quadrado (em cm): ");
        lado = entrada.nextDouble();
        double area = lado * lado;
        System.out.println("A o tamanho do lado do seu quadrado e: " + lado);
        System.out.println("A area da sua figura e: " + area + "cm2");
    }
}