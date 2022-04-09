package lista_python_02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numeroInteiro = scanner.nextInt();
        double divisaoNumerica = numeroInteiro%2;
        boolean divisaoDoNumero = divisaoNumerica == 0;
        if (divisaoDoNumero) {
            System.out.println("O número "+ numeroInteiro+" é par");
            } else {
            System.out.println("O numero "+ numeroInteiro+" é ímpar.");
        }
        scanner.close();
    }
}
