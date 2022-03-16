package br.com.logica.vetores;

import java.util.Scanner;

public class MediaPares {

    /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double media = 0;
        int x = 0;

        System.out.println("Quantos Elementos Vai Ter o Vetor?");
        int n = leia.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um Número: ");
            vet[i] = leia.nextDouble();

            if(vet[i] % 2 == 0) {
                media += vet[i];
                x += 1;
            }
        }

        if(media == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = media / x;
            System.out.println("Media dos Pares: " + media);
        }

        leia.close();
    }

}
