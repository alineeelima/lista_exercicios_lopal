package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double base;
        System.out.println("Informe o tamanho da base do seu retangulo (em cm): ");
        base = entrada.nextDouble();
        double altura;
        System.out.println("Informe a altura do seu retangulo (em cm): ");
        altura = entrada.nextDouble();
        double perimetro = (base * 2) + (altura * 2);
        System.out.println("A altura e a base do seu retangulo e: " + base + " e " + altura);
        System.out.println("A perimetro da sua figura e: " + perimetro);
    }
}