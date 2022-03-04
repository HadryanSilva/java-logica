import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        double salario, total, aumento;
        Scanner leia = new Scanner(System.in);


        System.out.print("Digite o Salário: ");
        salario = leia.nextDouble();

        if (salario <= 1000) {
            aumento = salario * 0.2;
            total = salario + aumento;
            System.out.println("Novo Salário: R$" + total);
            System.out.println("Aumento: R$" + aumento);
            System.out.println("Porcentagem: "+ 100 * 0.2 + "%");
        } else if (salario > 1000 && salario <= 3000) {
            aumento = salario * 0.15;
            total = salario + aumento;
            System.out.println("Novo Salário: R$" + total);
            System.out.println("Aumento: R$" + aumento);
            System.out.println("Porcentagem: "+ 100 * 0.15 + "%");
        } else if (salario > 3000 && salario <=8000) {
            aumento = salario * 0.1;
            total = salario + aumento;
            System.out.println("Novo Salário: R$" + total);
            System.out.println("Aumento: R$" + aumento);
            System.out.println("Porcentagem: "+ 100 * 0.1 + "%");
        } else if (salario > 8000) {
            aumento = salario * 0.05;
            total = salario + aumento;
            System.out.println("Novo Salário: R$" + total);
            System.out.println("Aumento: R$" + aumento);
            System.out.println("Porcentagem: "+ 100 * 0.05 + "%");
        } 



        leia.close();

    }
}
