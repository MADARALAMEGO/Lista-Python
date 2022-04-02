package lista_python;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pesca: ");
        double peso = scanner.nextDouble();
        double excesso = (peso - 50);
        double multa = (excesso * 4);
        System.out.println("O senhor deverá pagar " + multa + "R$ a mais devido o excesso de peso.");

        scanner.close();
    }
}
