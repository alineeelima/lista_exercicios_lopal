package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tempo de empresa de um funcionário (em meses): ");
        int tempo_empresa = entrada.nextInt();
        if (tempo_empresa >= 3){
            System.out.println("O funcionário pode aderir ao plano de saúde!");
        }else{
            System.out.println("O funcionário não pode aderir ao plano de saúde!");
        }
    }
}