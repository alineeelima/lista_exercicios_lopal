package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual é o cargo do funcionário: ");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("ADMINISTRATIVO")) {
            System.out.println("Pode participar do cruso de idiomas.");
        }else if(resposta.equalsIgnoreCase("LIDERANÇA")){
            System.out.println("Pode participar do cruso de idiomas.");
        }else{
            System.out.println("Não pode particpar do curso de idiomas.");
        }
    }
}