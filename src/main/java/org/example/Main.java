package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] temperaturas = new double[9];
        int dias = 0;
        for (int i = 0; i < 9; i++){
            System.out.println("Informe a temperatura medida nesse dia: ");
            temperaturas[i] = entrada.nextDouble();
            if (temperaturas[i] > 30){
                dias ++;
            }
        }

        System.out.println("A qunatidade de dias com temperaturas acima de 30° foi(foram): "+ dias + " dias");
    }
}
