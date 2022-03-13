package br.com.logica.repeticao;

import java.util.Scanner;

public class Crescente {
    /*
        Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
        mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
        programa deve finalizar quando forem digitados dois valores iguais.
     */


    public static void main(String[] args) {
        int x, y;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o valor de X: ");
        x = leia.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = leia.nextInt();

        while(x != y) {
            
            if(x > y) {
                System.out.println("Decrescente");
            }else {
                System.out.println("br.com.logica.repeticao.Crescente");
            }

            System.out.print("Digite o valor de X: ");
            x = leia.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = leia.nextInt();

        }

        leia.close();
    }
}
