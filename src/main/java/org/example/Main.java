package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[][] culturas = new double[5][4];
        double cultura1 = 0;
        double cultura2 = 0;
        double cultura3 = 0;
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 4; j++){
                System.out.println("Informe a produção da cultura "+j+" no "+i+"° mês: ");
                culturas[i -1][j -1] = entrada.nextDouble();
                if (j == 1) {
                    cultura1 += culturas[i-1][j-1];
                }else if (j == 2){
                    cultura2 += culturas[i-1][j-1];
                }else if (j == 3){
                    cultura3 += culturas[i-1][j-1];
                }
            }
        }

        System.out.println("A produção total da 1º cultura foi: "+cultura1);
        System.out.println("A produção total da 2º cultura foi: "+cultura2);
        System.out.println("A produção total da 3º cultura foi: "+cultura3);
    }
}

