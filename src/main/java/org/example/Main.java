package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double valorHora;
        System.out.println("Informe o valor da sua hora de trabalho: ");
        valorHora = entrada.nextDouble();
        double horasTrabalhadas;
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();
        double salarioMensal = valorHora * horasTrabalhadas;
        System.out.println("O seu salário desse mês será de: R$" + salarioMensal);
    }
}