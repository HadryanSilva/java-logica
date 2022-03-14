package br.com.logica.vetores;

import java.util.Scanner;

public class Negativos {

    /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int x;

        System.out.println("Quantos Números Você vai Digitar? ");
        int n = leia.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            if (vet[i] < 0) {
                System.out.println("NEGATIVOS: " + vet[i]);
            }
        }

        leia.close();
    }
}
