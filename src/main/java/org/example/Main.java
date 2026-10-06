package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[][] areas = new double[7][4];
        double chuva1 = 0;
        double chuva2 = 0;
        double chuva3 = 0;
        double chuva4 = 0;
        for (int i = 1; i <= areas.length; i++){
            for (int j = 1; j <= areas[i].length; j++){
                System.out.println("Informe a quantidade de chuva registrada na área "+j+" no "+i+"° dia: ");
                areas[i -1][j -1] = entrada.nextDouble();
                if (j == 1) {
                    chuva1 += areas[i-1][j-1];
                }else if (j == 2){
                    chuva2 += areas[i-1][j-1];
                }else if (j == 3){
                    chuva3 += areas[i-1][j-1];
                }
            }
        }

        System.out.println("A quantiade total de chuva registrada na 1º área foi: "+chuva1);
        System.out.println("A quantiade total de chuva registrada na 2º área foi: "+chuva2);
        System.out.println("A quantiade total de chuva registrada na 3º área foi: "+chuva3);
    }
}

