//atividade 3

package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int[] valores = {4, 7, 8, 11, 16, 20};
        int pares = 0;

        for (int i = 0; i < valores.length; i++){
            if (valores[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("A quantidade de números pares é: " +pares);


    }
}










