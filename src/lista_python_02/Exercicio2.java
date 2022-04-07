package lista_python_02;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero ");
        double numeroDigitado = scanner.nextDouble();
        boolean negativoOuPositivo = numeroDigitado > 0;
        if (negativoOuPositivo) {
            System.out.println("O numero "+ numeroDigitado +" é positivo");
        } else {
            System.out.println("o numero "+ numeroDigitado + " é negativo");
        }
        scanner.close();
    }
}
