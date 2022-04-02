package lista_python;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double h = scanner.nextDouble();
        double PesoIdeal = ((72.7*h) - 58);
        System.out.print("O seu peso ideal é: "+ PesoIdeal);

        scanner.close();
    }
}
