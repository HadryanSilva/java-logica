
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        int x, y;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o valor de X: ");
        x = leia.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = leia.nextInt();

        while(x != y) {
            
            if(x > y) {
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }

            System.out.print("Digite o valor de X: ");
            x = leia.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = leia.nextInt();

        }

        leia.close();
    }
}
