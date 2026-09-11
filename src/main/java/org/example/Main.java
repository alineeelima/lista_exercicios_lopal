package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int avaliacao = 0;
        int cliente;
        for(cliente=0;cliente<10;){
            cliente++;
            System.out.println("Digite a nota do cliente "+ cliente + ": " );
            avaliacao = entrada.nextInt();
            System.out.println("Nota " +avaliacao+ " do cliente " +cliente+ ", registrada com sucesso.");
        }
        System.out.println("Foram registradas " + cliente + " avaliações");
    }
}