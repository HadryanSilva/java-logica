import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidacaoDeNota {

    /*
        Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
        média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
        intervalo [0,10]). Cada nota deve ser validada separadamente.
     */

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String opcao = "";
        double x, y;
        boolean valido = true;

        while(valido) {

            System.out.print("Digite o Valor da Primeira Nota: ");
            x = leia.nextDouble();
            while(x < 0 || x > 10) {
                System.out.println("Valor Inválido, Tente Novamente!");
                System.out.print("Digite o Valor da Primeira Nota: ");
                x = leia.nextDouble();
            }

            System.out.print("Digite o Valor da Segunda Nota: ");
            y = leia.nextDouble();
            while(y < 0 || y > 10) {
                System.out.println("Valor Inválido, Tente Novamente!");
                System.out.print("Digite o Valor da Primeira Nota: ");
                y = leia.nextDouble();
            }

            System.out.println("Média: " + ((x + y) / 2));

            System.out.println("Deseja Encerrar o programa? S / N");
            opcao = leia.nextLine();

            if(opcao.equals("S")) {
                valido = false;
            }


        }


    }

}
