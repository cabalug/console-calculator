package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        numero1 = getValue("Enter the first number");
        numero2 = getValue("Enter the second number");

        System.out.println("El resultado es: " + addition(numero1, numero2));

    }

    public static int getValue(String message) {
        int number = 0;
        boolean esEntero = false;

        do {
            try {

                number = enterValue(message);
                esEntero = true;

            } catch (NumberFormatException error) {
                System.out.println("El número debe ser entero");
                esEntero = false;
            }

        } while (esEntero == false);
        return number;
    }

    public static int enterValue(String message) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("===================");
        System.out.println(message);
        System.out.println("===================");

        return Integer.parseInt(teclado.next());
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
}