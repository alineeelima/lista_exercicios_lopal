package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for(int venda=1;venda<=5;venda++){
            System.out.println("Digite o valor da compra "+ venda + ": " );
            total = total + entrada.nextDouble();
        }
        System.out.println("O faturamento total é de: R$"+ total);
    }
}