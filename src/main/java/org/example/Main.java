package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("DAME UN NUMERO");
        System.out.println("===================");
        int numero1 = teclado.nextInt();

        System.out.println("===================");
        System.out.println("DAME OTRO NUMERO");
        System.out.println("===================");
        int numero2 = teclado.nextInt();
    }
}