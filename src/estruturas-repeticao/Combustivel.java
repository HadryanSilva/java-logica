import java.util.Scanner;

public class Combustivel {

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

    }
}
