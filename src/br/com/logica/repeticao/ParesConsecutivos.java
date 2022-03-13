package br.com.logica.repeticao;

import java.util.Scanner;

public class ParesConsecutivos {

    /*
        O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
        for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X
        , se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação:
        4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a
        soma de 12+14+16+18+20.
     */

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 1;
        int soma = 0;

        while (x != 0) {
            System.out.print("Digite o valor de X: ");
            x = leia.nextInt();
            soma = 0;

            if(x != 0 && x % 2 == 0) {
                soma = x;
                for(int i = 0; i <= 5; i++) {
                    soma += x + 2;
                }
                System.out.println("SOMA: " + soma);
            } else if(x != 0) {
                soma = x += 1;
                for(int i = 0; i < 4; i++) {
                    soma += (x += 2);
                }
                System.out.println("SOMA: " + soma);
            }
        }
    }
}
