package lista_python_02;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero ");
        double numeroDigitado = scanner.nextDouble();
        boolean negativoOuPositivo = numeroDigitado > 0;
        if (negativoOuPositivo) {
            System.out.println("O numero é "+ numeroDigitado +" positivo");
        } else {
            System.out.println("o numero é "+ numeroDigitado + " negativo");
        }
        scanner.close();
    }
}
