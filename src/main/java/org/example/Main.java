package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] talhao = new double[5];

        for (int i = 0; i <= 4; i++){
            System.out.println("Informe a quantidade de hortaliças produzidas pelo talhão "+i+": ");
            talhao[i] = entrada.nextDouble();
        }
        System.out.println("O primeiro talhão produziu "+ talhao[0] +" hortaliças.");
        System.out.println("O segundo talhão produziu "+ talhao[1] +" hortaliças.");
        System.out.println("O terceiro talhão produziu "+ talhao[2] +" hortaliças.");
        System.out.println("O quarto talhão produziu "+ talhao[3] +" hortaliças.");
        System.out.println("O quinto talhão produziu "+ talhao[4] +" hortaliças.");
    }
}
