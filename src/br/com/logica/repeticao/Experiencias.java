package br.com.logica.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiencias {

    /*
        Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
        organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
        quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
        laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
        informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
        utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
        valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
        inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
        de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
        cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
        percentual deve ser apresentado com dois dígitos após o ponto.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,##00.00");
        Scanner leia = new Scanner(System.in);
        int n;
        double coelhos = 0;
        double sapos = 0;
        double ratos = 0;
        double total = 0;

        double porcCoelhos = 0;
        double porcSapos= 0;
        double porcRatos = 0;

        String cobaias;

        System.out.println("Quantos Casos de Teste Serão Digitados?");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite Quantas Cobaias Foram Utilizadas: ");
            int x = leia.nextInt();
            System.out.print("Digite o Tipo de Cobaia: ");
            cobaias = leia.next();

            switch (cobaias) {
                case "C":
                    coelhos += x;
                    total += x;

                    break;
                case "R":
                    ratos += x;
                    total += x;

                    break;
                case "S":
                    sapos += x;
                    total += x;

                    break;
                default:
                    System.out.println("Caractere Invalido!");
                    break;
            }

            /*if (cobaias.equals("C") || cobaias.equals("R") || cobaias.equals("S")) {
                if (cobaias.equals("C")) {
                    coelhos += x;
                    total += x;

                    porcCoelhos = (coelhos / total) * 100;

                } else if (cobaias.equals("R")) {
                    ratos += x;
                    total += x;
                    porcRatos = (ratos / total) * 100;

                } else if (cobaias.equals("S")) {
                    sapos += x;
                    total += x;
                    porcSapos = (sapos / total) * 100;
                }

            } else {
                System.out.println("Caractere Inválido");
            }*/


        }

        porcCoelhos = (coelhos / total) * 100;
        porcRatos = (ratos / total) * 100;
        porcSapos = (sapos / total) * 100;


        System.out.println("RELATORIO FINAL\n" + "Total: " + total + "\nTotal de Coelhos: "
                + coelhos + "\nTotal de Ratos: " + ratos + "\nTotal de Sapos: " + sapos);

        System.out.println("Percentual de Coelhos: " + df.format(porcCoelhos) + "%\nPercentual de Ratos: " + df.format(porcRatos) +
                "%\nPercentual de Sapos: " + df.format(porcSapos));

        leia.close();
    }
}
