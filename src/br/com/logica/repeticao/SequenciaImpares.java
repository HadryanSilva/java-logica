package br.com.logica.repeticao;

import java.util.Scanner;

public class SequenciaImpares {

    /*
        Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
        se for o caso.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int x;

        System.out.print("Digite o valor de X: ");
        x = leia.nextInt();

        if (x % 2 == 0) {
            for (int i = 1; i < x;i += 2) {
                System.out.println(i);
            }
        } else {
            for (int i = 1; i <= x;i += 2) {
                System.out.println(i);
            }
        }

        leia.close();
    }

}
