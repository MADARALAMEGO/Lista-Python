package lista_python;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double dobro = area * 2;

        System.out.println("O dobro da área do quadrado é: "+dobro);

        scanner.close();
    }
}
