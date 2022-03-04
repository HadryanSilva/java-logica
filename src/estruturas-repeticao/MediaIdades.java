import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        int idade = 0;
        int idades = 0;
        int media = 0;
        int contador = 1;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a Idade: ");
        idade = leia.nextInt();

        if(idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
            idades = 0;
        }

        while(idade >= 0) {
            System.out.println("Digite a Idade: ");
            idade = leia.nextInt();

            if(idade > 0) {
                idades += idade;
                contador++;

            }
        }
            media = idades / contador;
            System.out.println("Media: " + media);
    }
}
