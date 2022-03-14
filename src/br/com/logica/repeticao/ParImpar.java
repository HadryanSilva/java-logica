package br.com.logica.repeticao;

import java.util.Scanner;

public class ParImpar {

    /*
        Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
        Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
        se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
        apenas NULO
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n, x;

        System.out.print("Quantos numeros você vai digitar? ");
        n  = leia.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = leia.nextInt();

            if (x % 2 == 0 && x > 0) {
                System.out.println("Numero Par");
                System.out.println("Numero Positivo");
            }  else if(x > 0){
                System.out.println("Numero Impar");
                System.out.println("Numero Positivo");
            } else if (x < 0 && x % 2 == 0){
                System.out.println("Numero Par");
                System.out.println("Numero Negativo");
            } else if (x == 0){
                System.out.println("Numero Nulo");
            } else {
                System.out.println("Numero Impar");
                System.out.println("Numero Negativo");
            }

        }

        leia.close();
    }
}
