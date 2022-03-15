package br.com.logica.vetores;

import java.util.Scanner;

public class MaiorPosicao {

    /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Números Você Irá Digitar? ");
        int n = leia.nextInt();

        int[] vet = new int[n];
        int maior = 0;
        int indice = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextInt();

            if(vet[i] > maior) {
                maior = vet[i];
                indice = i;
            }
        }

        System.out.println("Maior Valor: " + maior);
        System.out.println("Posição do Maior Valor: " + indice + "°");

        leia.close();
    }

}
