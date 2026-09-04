package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota do aluno: ");
        Double nota = entrada.nextDouble();
        if (nota >= 7.5){
            System.out.println("Excelente");
        }
        if (nota >= 5.00 && nota < 7.5){
            System.out.println("Bom");
        }
        if (nota >= 2.5 && nota < 5.0){
            System.out.println("Regular");
        }
        if (nota < 2.5){
            System.out.println("Insuficiente");
        }
        if (nota < 0 || nota > 10){
            System.out.println("Nota inválida");
        }
    }
}