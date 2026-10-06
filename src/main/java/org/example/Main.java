package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        int[] num = {10, 20, 30 ,40 ,50};
        int soma = 0;
        for (int i = 0; i < 5; i++){
            System.out.println(num[i]);
            soma += num[i];
        }
        System.out.println("A soma dos números do vetor é igual a: "+soma);
    }
}

