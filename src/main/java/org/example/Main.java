package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é o saláario mensal do cliente: ");
        double salario = entrada.nextDouble();
        System.out.print("Qual é o saláario mensal do cliente: ");
        double parcela = entrada.nextDouble();

        if (parcela >= ((salario*30)/100)) {
            System.out.println("Sua solicitação foi negada.");
        }else{
            System.out.println("Seu empréstimo foi aceito.");
        }
    }
}