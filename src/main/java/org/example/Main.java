package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] areas = new double[8];
        int menorQuarenta = 0;

        for (int i = 0; i < 8; i++){
            System.out.println("Informe a umidade do ar na área "+i+" (em porcentagem): ");
            areas[i] = entrada.nextDouble();

            if (areas[i] < 40){
                menorQuarenta ++;
            }
        }
        System.out.println("Existem "+ menorQuarenta +" áreas com menos de 40% de umidade.");
    }
}
