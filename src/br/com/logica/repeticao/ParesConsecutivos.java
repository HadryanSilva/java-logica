package br.com.logica.repeticao;

import java.util.Scanner;

public class ParesConsecutivos {



    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x = 1;
        int soma = 0;

        while (x != 0) {
            System.out.print("Digite o valor de X: ");
            x = leia.nextInt();

            if(x != 0 && x % 2 == 0) {
                for(int i = 0; i < 5; i++) {
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
