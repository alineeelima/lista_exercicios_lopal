package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] talhao = new double[5];
        double talhao1 = 0;
        double talhao2 = 0;
        double talhao3 = 0;
        double talhao4 = 0;
        double talhao5 = 0;

        for (int i = 0; i <= 4; i++){
            System.out.println("Informe a quantidade de hortaliças produzidas pelo talhão "+i+": ");
            talhao[i] = entrada.nextDouble();
            if (i == 0){
                talhao1 = talhao[i];
            }else if (i == 1){
                talhao2 = talhao[i];
            }else if (i == 2){
                talhao3 = talhao[i];
            }else if (i == 3){
                talhao4 = talhao[i];
            }else{
                talhao5 = talhao[i];
            }
        }

        System.out.println("O primeiro talhão produziu "+ talhao1 +" hortaliças.");
        System.out.println("O segundo talhão produziu "+ talhao2 +" hortaliças.");
        System.out.println("O terceiro talhão produziu "+ talhao3 +" hortaliças.");
        System.out.println("O quarto talhão produziu "+ talhao4 +" hortaliças.");
        System.out.println("O quinto talhão produziu "+ talhao5 +" hortaliças.");
    }
}
