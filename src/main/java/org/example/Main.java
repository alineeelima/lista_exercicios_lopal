package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dividendo da operação: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o divisor da operação: ");
        int num2 = entrada.nextInt();
        int div = num1/num2;
        int resto = num1%num2;
        System.out.println("O resultado da sua operação é de: "+ div);
        System.out.println("O resto da sua operação é de: "+ resto);
    }
}