package lista_python;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        System.out.println( metros + "m é igual à " + centimetros + "cm");

        scanner.close();
    }
}
