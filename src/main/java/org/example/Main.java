package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o capital inicial: ");
        double capIn = entrada.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        double taxaJuros = entrada.nextDouble();
        System.out.println("Digite o tempo da dívida (em meses): ");
        double tempo = entrada.nextDouble();
        double juros = capIn * taxaJuros * tempo;
        System.out.println("O valor do seu juros (em juros simples) é de: "+ juros);
    }
}