package br.com.logica.repeticao;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;

        System.out.print("Deseja a Tabuada para qual Valor? ");
        n = leia.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));

        }

    }

}
