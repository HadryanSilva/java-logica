import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        int codigo, quantidade;
        double valor;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o Código do Produto: ");
        codigo = leia.nextInt();

        System.out.print("Digite a Quantidade Comprada: ");
        quantidade = leia.nextInt();

        if (codigo == 1) {
            valor = quantidade * 5;
            System.out.print("Valor a Pagar: R$" + valor);
        } else if (codigo == 2) {
            valor = quantidade * 3.50;
            System.out.print("Valor a Pagar: R$" + valor);
        } else if (codigo == 3) {
            valor = quantidade * 4.80;
            System.out.print("Valor a Pagar: R$" + valor);
        } else if (codigo == 4) {
            valor = quantidade * 8.90;
            System.out.print("Valor a Pagar: R$" + valor);
        } else if (codigo == 5) {
            valor = quantidade * 7.32;
            System.out.print("Valor a Pagar: R$" + valor);
        } else {
            System.out.print("Opção Incorreta!");
        }

        leia.close();

    }
}
