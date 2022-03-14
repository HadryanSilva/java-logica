package br.com.logica.repeticao;

import java.util.Scanner;

public class Fatorial {

    /*
        Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
        fatorial de N.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n;
        int fat = 0;

        System.out.print("Digite o valor de N: ");
        n = leia.nextInt();

        if(n > 15) {

            System.out.println("O número deve ser menor que 15");

        } else if (n == 0) {
            fat = 1;
            System.out.println("FATORIAL: " + fat);
        } else {
            fat = n;
            for (int i = n - 1; i != 0; i--) {
                fat *= i;
            }

            System.out.println("FATORIAL: " + fat);

        }

    }
}
