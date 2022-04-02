package lista_python;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        double Valor1 = scanner.nextDouble();

        System.out.print("Digite outro valor: ");
        double Valor2 = scanner.nextDouble();
        double soma = Valor1 + Valor2;
        System.out.println("A Soma desses valores é = " + soma);

        scanner.close();
    }
}
