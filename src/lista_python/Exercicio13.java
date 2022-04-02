package lista_python;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PESO IDEAL FEMININO");
        System.out.print("Digite sua altura: ");
        double hF = scanner.nextDouble();
        double PesoIdealF = ((62.1*hF) - 44.7);
        System.out.print("Seu peso ideal é: "+ PesoIdealF + "\n");
        System.out.println("                                   ");

        System.out.println("PESO IDEAL MASCULINO ");
        System.out.print("Digite sua altura: ");
        double hM = scanner.nextDouble();
        double PesoIdealM = ((72.7*hM) - 58);
        System.out.print("O seu peso ideal é: "+ PesoIdealM);

        scanner.close();
    }
}
