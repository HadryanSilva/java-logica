package br.com.logica.vetores;

import java.util.Scanner;

public class MaisVelho {

    /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idadeAlta =  0;
        String nomeIdadeAlta = " ";

        System.out.println("Quantas Pessoas Você Irá Cadastrar?");
        int n = leia.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "° Pessoa");
            System.out.print("Nome: ");
            nome[i] = leia.next();
            System.out.print("Idade: ");
            idade[i] = leia.nextInt();

            if(idade[i] > idadeAlta) {
                idadeAlta = idade[i];
                nomeIdadeAlta = nome[i];

            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeIdadeAlta + " Com " + idadeAlta + " Anos");
        leia.close();

    }

}
