package lista_python;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a área (m²) que deverá ser pintada: ");
        double area = scanner.nextDouble();
        double lata = area/54;
        double preco = lata *80;

        System.out.println("Você precisará de "+ lata + " latas");
        System.out.println("O preço sairá em torno de "+ preco +"R$");

        scanner.close();
    }
}
