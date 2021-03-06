package br.com.logica.repeticao;

import java.util.Scanner;

public class Combustivel {

    /*
        Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
        Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
        1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
        4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
        código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
        como as quantidades de cada combustível.
    */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int codigo = 0;
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;


        while(codigo != 4) {
            System.out.print("Informe um Código (1, 2, 3) ou 4 para Parar: ");
            codigo = leia.nextInt();

            if (codigo == 1) {
                alcool += 1;
            } else if(codigo == 2) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }

        }

        System.out.println("MUITO OBRIGADO\n" + "Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
        leia.close();
    }
}
