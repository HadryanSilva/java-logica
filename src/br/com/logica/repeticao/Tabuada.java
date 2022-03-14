package br.com.logica.repeticao;

import java.util.Scanner;

public class Tabuada {

    /*
        Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
     */

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;

        System.out.print("Deseja a Tabuada para qual Valor? ");
        n = leia.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));

        }

        leia.close();
    }

}
