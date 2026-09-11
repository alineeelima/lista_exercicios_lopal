package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a renda do cliente: ");
        double renda = entrada.nextDouble();

        System.out.print("Digite o score do cliente: ");
        double score = entrada.nextDouble();

        if (renda > 8000 && score > 700) {
            System.out.println("Você pode solicitar o cartão premium.");
        }else{
            System.out.println("Você não pode solicitar o cartão preimum.");
        }
    }
}