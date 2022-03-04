import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        String opcao;
        double temperatura, convert;
        Scanner leia = new Scanner(System.in);

        System.out.print("Em qual escalar irá inserir a temperatura? (C / F): ");
        opcao = leia.nextLine();

        System.out.print("Digite a temperatura: ");
        temperatura = leia.nextDouble();

        if(opcao.equals("C")) {
            convert = ((temperatura * 1.8) + 32);
            System.out.print("Temperatura em F°: " + convert);
        } else if (opcao.equals("F")) {
            convert = ((temperatura - 32) * 5/9);
            System.out.print("Temperatura em C°: " + convert);
        }else {
            System.out.println("Opcao Incorreta!");
        }

        leia.close();
    }
}
