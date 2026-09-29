package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner (System.in);
        double[] setores = new double[12];
        double maiorValor = 0;
        int maior = 0;
        for (int i = 0; i < 12; i++){
            System.out.println("Informe a quantidade de água utilizada pelo setor "+i+": ");
            setores[i] = entrada.nextDouble();
            if (setores[i] > maiorValor){
                maiorValor = setores[i];
                maior = i;
            }
        }

        System.out.println("O setor que mais consumiu água foi o setor "+ maior + ", que gastou "+ maiorValor+ " litros de água.");
    }
}
