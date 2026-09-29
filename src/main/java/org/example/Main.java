package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] milho = new double[6];
        double producaoTotal = 0;
        double media = 0;
        double maior = 0;
        for (int i = 0; i < 6; i++){
            System.out.println("Informe a quantidade de milho produzida nessa semana (em toneladas): ");
            milho[i] = entrada.nextDouble();
            producaoTotal += milho[i];
            if (milho[i] > maior){
                maior = milho[i];
            }
        }
        media = producaoTotal/7;

        System.out.println("A produção dessas 7 semanas foi: "+ producaoTotal + " toneladas");
        System.out.println("A maior produção registrada ao longo dessas semanas foi: " + maior + " toneladas");
        System.out.println("A média das produções reistradas foi: "+ media +" toneladas");
    }
}
