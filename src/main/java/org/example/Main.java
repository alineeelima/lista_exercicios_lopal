package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int valores[] = {12, 45, 8, 90,23};
        int maior = 0;
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        System.out.println("O maior valor é: "+maior);
    }
}







