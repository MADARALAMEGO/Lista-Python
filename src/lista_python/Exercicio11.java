package lista_python;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        double numeroInteiro = scanner.nextDouble();
        System.out.print("Digite outro numero inteiro: ");
        double numeroInteiro2 = scanner.nextDouble();
        System.out.print("Digite um numero real: ");
        double numeroReal = scanner.nextDouble();
        double produto = ((2*numeroInteiro) * (numeroInteiro2/2));
        double soma = ((3*numeroInteiro) + numeroReal);
        double cubo = (numeroReal * numeroReal * numeroReal);
        System.out.print("O produto do dobro do primeiro vezes a metade do segundo é igual a" + produto + "\n");
        System.out.print("A soma do triplo do primeiro mais o terceiro é igual a"+ soma + "\n");
        System.out.print("O cubo do terceiro é igual a"+ cubo + "\n");
        scanner.close();
    }
}
