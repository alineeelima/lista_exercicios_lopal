package org.example;
public class Main {
    static void main() {
        verificarPar(98, 74, 198);
    }
    static void verificarPar(double a, double b, double c){
        double maior = 0;
        if (a > maior){
            maior = a;
        }else if(b > maior){
            maior = b;
        }else{
            maior = c;
        }
        System.out.println("O maior número é: "+maior);
    }
}










