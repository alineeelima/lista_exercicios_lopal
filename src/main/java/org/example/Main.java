package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma medida em metros: ");
        double metros = entrada.nextDouble();
        double cm = metros * 100;
        double mm = metros * 1000;
        System.out.println("Medida em metros: "+ metros);
        System.out.println("Medida em cm: "+ cm);
        System.out.println("Medida em mm: "+ mm);
    }
}