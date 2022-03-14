package br.com.logica.repeticao;

import java.util.Scanner;

public class DentroOuFora {

    /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
        conforme exemplo
     */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int x, y  = 0;
        int dentro = 0;
        int fora = 0;

        System.out.print("Quantos numero você quer digitar? ");
        x = leia.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Digite um Numero: ");
            y = leia.nextInt();

            if (y >= 10 && y <= 20) {
               dentro +=  1;
            } else {
                fora += 1;
            }
        }

        System.out.println(dentro + " Numeros Dentro do Conjunto\n" + fora + " Numeros Fora do Conjunto");
        leia.close();
    }

}
