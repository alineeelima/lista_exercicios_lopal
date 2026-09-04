package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("O funcionário utiliza veículo próprio para trabalhar? (S/N): ");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("SIM")) {
            System.out.println("Ele pode solicitar auxílio combustível.");
        } else {
            System.out.println("Ele não pode solicitar auxílio combustível.");
        }
    }
}