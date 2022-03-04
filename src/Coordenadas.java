import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {
        
        double x, y;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        x = leia.nextDouble();

        System.out.print("Digite o valor de Y: ");
        y = leia.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        }


    leia.close();
    
    }
    
}
