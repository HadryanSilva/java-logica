package br.com.logica.vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alturas {

    /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,##0.00");

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas Pessoas Serão Cadastradas? ");
        int x = leia.nextInt();

        String[] nome = new String[x];
        int[] idade = new int[x];
        double [] altura = new  double[x];
        double media = 0;
        double porcPessoas = 0;
        int totalPessoas = 0;



        for (int i = 0; i < x; i++) {
            System.out.println("Digite os Dados da " + (i + 1) + " Pessoa");
            System.out.print("Nome: ");
            nome[i] = leia.next();

            System.out.print("idade: ");
            idade[i] = leia.nextInt();

            totalPessoas += 1;
            if (idade[i] < 16) {
                porcPessoas += 1;
            }

            System.out.print("Altura: ");
            altura[i] = leia.nextDouble();
            media += altura[i];

        }

        porcPessoas = (porcPessoas / totalPessoas) * 100;
        media = media / x;
        System.out.println("Altura Média: " + df.format(media));
        System.out.println("Pessoas com Menos de 16 Anos: " + porcPessoas + "%");
        if (porcPessoas != 0) {
            for(int i = 0; i < x; i++) {
                if(idade[i] < 16) {
                    System.out.println(nome[i]);
                }
            }
        }

        leia.close();
    }

}
