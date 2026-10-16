package org.example;
public class Main {
    static void main() {
        if (verificarPar(98) == 0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
    }
    static double verificarPar(int a){
        return a%2;
    }
}










