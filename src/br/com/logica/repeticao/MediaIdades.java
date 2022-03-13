package br.com.logica.repeticao;

import java.util.Scanner;

public class MediaIdades {

    /*
        Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
        indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
        e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
        mostrar a mensagem "IMPOSSIVEL CALCULAR".
     */

    public static void main(String[] args) {
        int idade, idades, media = 0;
        boolean check = true;
        int contador = 1;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a Idade: ");
        idade = leia.nextInt();
        idades = idade;

        if(idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
            check = false;
            idades = 0;
        }

        while(idade >= 0) {
            System.out.print("Digite a Idade: ");
            idade = leia.nextInt();
            idades += idade;

            if(idade > 0) {
                idades += idade;
                contador++;

            }
        }
            media = idades / contador;
        if(check) {
            System.out.println("Media: " + media);
        }
    }
}
