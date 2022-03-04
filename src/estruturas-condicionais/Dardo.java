import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Double dardo1, dardo2, dardo3, maior;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a distancia do dardo: ");
        dardo1 = leia.nextDouble();
        System.out.println("Digite a distancia do dardo: ");
        dardo2 = leia.nextDouble();
        System.out.println("Digite a distancia do dardo: ");
        dardo3 = leia.nextDouble();

        if(dardo1 > dardo2 && dardo1 > dardo3) {
            maior = dardo1;
            System.out.println("Maior Distância: " + maior);
        }else if (dardo2 > dardo1 && dardo2 > dardo3) {
            maior = dardo2;
            System.out.println("Maior Distância: " + maior);
        }else if (dardo3 > dardo1 && dardo3 > dardo2) {
            maior = dardo3;
            System.out.println("Maior Distância: " + maior);
        }else {
            System.out.println("Valores Incorretos!!!");
        }

        leia.close();

    }
}