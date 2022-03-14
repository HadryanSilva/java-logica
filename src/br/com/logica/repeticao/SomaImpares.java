package br.com.logica.repeticao;

import java.util.Scanner;

public class SomaImpares {

    /*
        Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
        impares entre eles.

     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int x, y;
        int soma = 0;

        System.out.print("Digite o valor de X: ");
        x = leia.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = leia.nextInt();



        if(x < y) {
            if (x % 2 != 0) {
                soma = x;
            } else {
                x += 1;
            }
            for(int i = x; i < y; i += 2) {
                soma += x + 2;
            }
        } else {
            if (y % 2 == 0) {
                y += 1;
            }

            if (y < 0) {
                if(x % 2 == 0){
                    x -= 1;
                }
                for (int i = y;i < x; i += 2) {
                    y = i;
                    soma += (y * (-1));
                    //System.out.println(soma);
                }
            } else {
                for (int i = y;i < x; i += 2) {
                    y = i;
                    soma += y;
                    //System.out.println(soma);
                }
            }

        }

        System.out.println("Soma dos Impares: " + soma);
        leia.close();
    }

}
