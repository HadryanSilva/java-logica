package br.com.logica.condicionais;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        int horaInicial, horaFinal, duracao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a Hora Inicial: ");
        horaInicial = leia.nextInt();

        System.out.print("Digite a Hora Final: ");
        horaFinal = leia.nextInt();

        if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("Hora Inicial: " + horaInicial + "\nHora Final: " + horaFinal + "\nDuração: " + duracao);
        } else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("Hora Inicial: " + horaInicial + "\nHora Final: " + horaFinal + "\nDuração: " + duracao);
        }else if (horaInicial == horaFinal) {
            duracao = 24;
            System.out.println("Hora Inicial: " + horaInicial + "\nHora Final: " + horaFinal + "\nDuração: " + duracao);
        }

        leia.close();
    }
}
