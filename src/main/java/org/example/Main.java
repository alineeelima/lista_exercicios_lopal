package org.example;
public class Main {
    static void main() {
        calcularExpoente(2, 4);
    }
    static void calcularExpoente(int b, int e){
        int resultado = 1;
        for (int i = 1; i <= e; i++){
            resultado *= b;
        }
        System.out.println("O resultado é: "+resultado);
    }
}










