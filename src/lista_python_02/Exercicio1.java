package lista_python_02;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo numero ");
        double segundoNumero = scanner.nextDouble();
        Boolean numeromaior = primeiroNumero > segundoNumero;
        if (numeromaior) {
            System.out.println("O numero maior é "+primeiroNumero);
        } else {
            System.out.println("O numero maior é "+segundoNumero);
        }
        scanner.close();
    }
}

