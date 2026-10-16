package org.example;
public class Main {
    static void main() {
        calcularFatorial(3);
    }
    static void calcularFatorial(int a){
        int resultado = 1;
        for (int i = 1; i <= a; i++) {
            resultado *= i;
        }
        System.out.println("O resultado de "+a+"! é: "+resultado);
    }
}










