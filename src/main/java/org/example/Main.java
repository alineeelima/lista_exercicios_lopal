package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double preco;
        System.out.println("Informe o valor do seu produto: ");
        preco = entrada.nextDouble();
        double desconto = preco - ((preco * 15) / 100);
        System.out.println("O valor do seu produto sem desconto e: " + preco);
        System.out.println("O valor do seu produto com desconto e: " + desconto);
    }
}