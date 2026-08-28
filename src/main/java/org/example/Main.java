package org.example;
public class Main {
    static void main() {
        boolean A = true;
        boolean B = false;
        boolean cond1, cond2, cond3;
        cond1 = A && B;
        cond2 = A || B;
        cond3 = !A;
        System.out.println("A e B: " + cond1);
        System.out.println("A ou B: " + cond2);
        System.out.println("Inverso de A: " + cond3);
    }
}