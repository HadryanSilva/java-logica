package br.com.logica.repeticao;

import java.util.Scanner;

public class Divisao {

    /*
        Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
        segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
     */


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n;
        double numerador, denominador;
        double resultado = 0;

        System.out.println("Quantos Casos Irá Digitar? ");
        n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor do Numerador: ");
            numerador = leia.nextDouble();

            System.out.print("Digite o valor do Denominador: ");
            denominador = leia.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisão Impossível");
            } else {
                resultado = numerador / denominador;
                System.out.println("DIVISAO = " + resultado);
            }
        }

        leia.close();
    }
}
