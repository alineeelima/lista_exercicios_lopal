package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da transação: ");
        double transacao = entrada.nextDouble();

        if (transacao > 10000) {
            System.out.println("Cuidado! Transação suspeita.");
        }else{
            System.out.println("Essa transação é segura.");
        }
    }
}