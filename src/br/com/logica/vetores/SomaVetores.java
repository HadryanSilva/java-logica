package br.com.logica.vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SomaVetores {

    /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Valores Vai ter Cada Vetor: ");
        int n = leia.nextInt();

        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetFinal = new int[n];

        System.out.print("Vetor 1");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vetA[i] = leia.nextInt();
        }

        System.out.print("Vetor 2");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vetB[i] = leia.nextInt();
            vetFinal[i] = vetA[i] + vetB[i];
        }

        System.out.println("Vetor Resultante");
        for (int i = 0; i < n; i++) {
            System.out.println(vetFinal[i]);
        }

        leia.close();
    }

}
