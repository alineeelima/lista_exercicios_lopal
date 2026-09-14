package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        String resposta;
        do {
            System.out.println("Digite o valor do produto: ");
            total = total + entrada.nextDouble();
            System.out.println("Deseja continuar? (sim/não)");
            entrada.nextLine();
            resposta = entrada.nextLine();
        } while (resposta.equalsIgnoreCase("Sim"));
        System.out.println("O valor total da sua compra é de: "+total);
    }
}