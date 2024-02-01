package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean esEntero = false;
        do {
            try {

                System.out.println("PIDE UN NUMERO");
                numero1 = Integer.parseInt(teclado.next());
                esEntero = true;


            } catch (NumberFormatException error) {
                System.out.println("El número debe ser entero");
                esEntero = false;
            }
        } while (esEntero == false);
        do {
            try {

                System.out.println("ESCRIBE OTRO NUMERO");
                numero2 = Integer.parseInt(teclado.next());
                esEntero = true;


            } catch (NumberFormatException error) {
                System.out.println("El número debe ser entero");
                esEntero = false;
            }
        } while (esEntero == false);
    }
}