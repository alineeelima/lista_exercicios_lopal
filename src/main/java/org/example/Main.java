package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double reais;
        System.out.println("Informe a quantia que você possui em reais: ");
        reais = entrada.nextDouble();
        double cotacao;
        System.out.println("Informe a cotação atual do dólar: ");
        cotacao = entrada.nextDouble();
        double valorFinal = reais/cotacao;
        System.out.println("A sua quantia em reais equivale a $" + valorFinal);
    }
}