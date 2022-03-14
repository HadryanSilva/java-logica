package br.com.logica.vetores;

import java.util.Scanner;

public class SomaVetor {

    /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double soma = 0;
        double media;

        System.out.println("Quantos Números Você Vai Digitar? ");
        int x = leia.nextInt();
        double [] vet = new double[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextDouble();
            soma += vet[i];
        }

        for (int i = 0; i < x; i++) {
            System.out.println("Valor "+ (i + 1) + ": " + vet[i]);
        }

        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA: " + (soma / vet.length));

        leia.close();
    }

}
