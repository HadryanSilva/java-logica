package br.com.logica.vetores;

import java.util.Scanner;

public class AbaixoDaMedia {

    /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double media = 0;

        System.out.println("Quantos Elementos Terá o Vetor?");
        int n = leia.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextDouble();
            media += vet[i];
        }

        media = media / n;

        System.out.println("Media do Vetor: " + media);
        System.out.println("Elementos Abaixo da Media");

        for (int i = 0; i < n; i++) {
            if(vet[i] < media) {
                System.out.println(vet[i]);
            }
        }


    }

}
