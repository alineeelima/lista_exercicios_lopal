package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o saldo médio mensal do cliente: ");
        double saldoMedio = entrada.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Você tem direito a isenção de tarifa.");
        }else{
            System.out.println("Você não tem direito a isenção de tarifa.");
        }
    }
}