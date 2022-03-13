package br.com.logica.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaPonderada {

    /*
        Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
        teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
        que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
        que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
        pela soma dos pesos.
     */

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.0");

        int n;
        double valor1, valor2, valor3, media;

        System.out.println("Quantos casos você irá digitar: ");
        n = leia.nextInt();

        for (int i = 0; i< n; i++) {
            System.out.print("Digite o Primeiro Valor: ");
            valor1 = leia.nextDouble();
            valor1 = valor1 * 2;

            System.out.print("Digite o Primeiro Valor: ");
            valor2 = leia.nextDouble();
            valor2 = valor2 * 3;

            System.out.print("Digite o Primeiro Valor: ");
            valor3 = leia.nextDouble();
            valor3 = valor3 * 5;

            media = (valor1 + valor2 + valor3) / (2 + 3 + 5);

            System.out.println("MEDIA = " + df.format(media));
        }

    }

}
