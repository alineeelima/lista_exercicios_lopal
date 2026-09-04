package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor investido pelo cliente: ");
        double investimento = entrada.nextDouble();

        if (investimento > 100000) {
            System.out.println("Sua categoria é platina.");
        }else if(investimento > 50000 && investimento <= 100000){
            System.out.println("Sua categoria é ouro.");
        }else if(investimento > 10000 && investimento <= 50000){
            System.out.println("Sua categoria é prata.");
        }else{
            System.out.println("Sua categoria é bronze.");
        }
    }
}