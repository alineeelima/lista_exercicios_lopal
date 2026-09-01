package org.example;
import java.lang.Math;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = entrada.nextInt();
        int troca = A;
        A = B;
        B = troca;
        System.out.println("O novo valor de A é: "+ A);
        System.out.println("O novo valor de B é: "+ B);
    }
}