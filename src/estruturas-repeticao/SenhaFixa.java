import java.util.Scanner;

public class SenhaFixa {

    /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
        senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
        for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
        encerrado. Considere que a senha correta é o valor 2002.
     */

    public static void main(String[] args) {
        int senha, senhaAux = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        senha = leia.nextInt();

        while(senha != senhaAux){
            System.out.print("Digite a senha: ");
            senhaAux = leia.nextInt();
            if (senha != senhaAux) {
                System.out.println("Senha Incorreta, Tente Novamente!");
            }
        }

        System.out.println("Acesso Permitido!");
    }

}
