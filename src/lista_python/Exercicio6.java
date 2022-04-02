package lista_python;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        double pi = (3.14);

        double areaCirculo = (pi*raio*raio);
        System.out.print("A área da circuferência é: " +areaCirculo);

        scanner.close();
    }
}
