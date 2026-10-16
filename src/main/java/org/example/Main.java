package org.example;
public class Main {
    static void main() {
        calcularIMC(52, 1.59);
    }
    static void calcularIMC(double p, double a){
        double imc = p/(a*a);
        System.out.println("O IMC é: "+ imc);
    }
}










