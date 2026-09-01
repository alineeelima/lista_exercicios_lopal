package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua altura (em m): ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o seu peso (em kg): ");
        double peso = entrada.nextDouble();
        double imc = peso / (altura*altura);
        System.out.println("O seu índice de massa corporal é igual a: "+ imc);
    }
}