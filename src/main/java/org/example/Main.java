package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um tempo (em segundos): ");
        int segundos = entrada.nextInt();
        int todosMinutos = segundos/60;
        int horas = todosMinutos/60;
        int minutos = todosMinutos%60;
        int resto = segundos%60;
        System.out.println("O seu tempo é igual a: "+ horas + " hora(s), " +minutos+ " minuto(s) e "+resto+" segundo(s)");
    }
}