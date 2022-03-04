import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        int x, y;
        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite o Primeiro Numero: ");
        x = leia.nextInt();
        System.out.print("Digite o Segundo Numero: ");
        y = leia.nextInt();
    
        
        if (x > y) {
            if(x % y == 0) {
                System.out.println("São Multiplos!");
            } else {
                System.out.println("Não são múltiplos!");
            }          
        } else if (x < y) {
            if(y % x == 0) {
                System.out.println("São Multiplos!");
            } else {
                System.out.println("Não são múltiplos!");
            }
        }
    
        leia.close();
    }

}
