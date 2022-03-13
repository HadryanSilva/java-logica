import java.util.Scanner;

public class ValidacaoDeNota {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
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

        }


    }

}
