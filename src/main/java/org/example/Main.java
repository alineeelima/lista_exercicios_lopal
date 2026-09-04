package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o salário mensal de um funcionário: ");
        Double salario = entrada.nextDouble();
        if (salario >= 4000){
            System.out.println("Você não tem direito ao vale refeição!");
        }else{
            System.out.println("Você tem direito ao vale refeiçãõ!");
        }
    }
}