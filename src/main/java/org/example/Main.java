package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        double distancia;
        System.out.println("Informe a quantidade de quilômetros percorridos: ");
        distancia = entrada.nextDouble();
        double combustivel;
        System.out.println("Informe a quantidade de combustível gasto: ");
        combustivel = entrada.nextDouble();
        double consumoMedio = distancia / combustivel;
        System.out.println("O consumo médio do seu veículo é de (km/l): " + consumoMedio);
    }
}