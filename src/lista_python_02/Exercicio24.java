package lista_python_02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numeroInformado = scanner.nextDouble();
        boolean numeroPositivo = numeroInformado > 0;
        double divisaoNumerica = numeroInformado % 2;
        boolean divisaoDoNumero = divisaoNumerica == 0;
        boolean divisaoDoNumero2 = numeroInformado % 1 == 0;
        if (numeroPositivo && divisaoDoNumero && divisaoDoNumero2 ) {
            System.out.println("Seu numero é Positivo, Par e Inteiro");
        } else if (numeroPositivo && divisaoDoNumero == false && divisaoDoNumero2) {
            System.out.println("Seu numero é Positivo, Impar e Inteiro");
        } else if (numeroPositivo == false && divisaoDoNumero && divisaoDoNumero2) {
            System.out.println("Seu numero é Negativo, Par e Inteiro");
        } else if (numeroPositivo == false && divisaoDoNumero == false && divisaoDoNumero2) {
            System.out.println("Seu numero é Negativo, Impar e Inteiro");
        } else if (numeroPositivo == false && divisaoDoNumero && divisaoDoNumero2 == false) {
            System.out.println("Seu numero é Negativo, Par e Decimal");
        } else if (numeroPositivo == false && divisaoDoNumero == false && divisaoDoNumero2 == false) {
            System.out.println("Seu numero é Negativo, Impar e Decimal");
        } else if (numeroPositivo && divisaoDoNumero && divisaoDoNumero2 == false) {
            System.out.println("Seu numero é Positivo, Par e Decimal");
        } else if (numeroPositivo && divisaoDoNumero == false && divisaoDoNumero2 == false) {
            System.out.println("Seu numero é Positivo, Impar e Decimal");
        }
        scanner.close();
    }
}
