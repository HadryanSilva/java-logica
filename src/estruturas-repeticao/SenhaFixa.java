import java.util.Scanner;

public class SenhaFixa {

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
