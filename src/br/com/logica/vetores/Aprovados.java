package br.com.logica.vetores;

import java.util.Scanner;

public class Aprovados {

    /*
         Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
         no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
         os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
         igual a 6.0 (seis).
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Alunos Serão Cadastrados? ");
        int n = Integer.parseInt(leia.nextLine());

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];
        String[] aprovados = new String[n];


        for (int i = 0; i < n; i++) {

            System.out.print("Digite o Nome: ");
            nome[i] = leia.nextLine();

            System.out.print("Digite a Primeira Nota: ");
            nota1[i] = Double.parseDouble(leia.nextLine());

            System.out.print("Digite a Segunda Nota: ");
            nota2[i] = Double.parseDouble(leia.nextLine());

            media[i] = (nota1[i] + nota2[i]) / 2;

            if(media[i] >= 6.0) {
                aprovados[i] = nome[i];
            }

        }

        System.out.println("ALUNOS APROVADOS");
        for (int i = 0; i < n; i++) {
            if (media[i] != 0 && aprovados[i] != null) {
                System.out.println(aprovados[i]);
            }
        }

        leia.close();

    }

}
