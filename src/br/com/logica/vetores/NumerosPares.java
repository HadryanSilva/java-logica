package br.com.logica.vetores;

import java.util.Scanner;

public class NumerosPares {

    /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Números Você Irá Digitar? ");
        int n = leia.nextInt();

        int[] vet = new int[n];
        int pares = 0;

        for(int i = 0; i < n;i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(vet[i] % 2 == 0) {
                pares += 1;
            }
        }

        System.out.print("Numeros Pares: ");
        for (int i = 0; i < n; i++) {
            if(vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        System.out.println("Quantidade de Pares: " + pares);
        leia.close();
    }

}
