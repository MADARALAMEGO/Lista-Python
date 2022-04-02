package lista_python;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho Arquivo (MB): ");
        double arquivo = scanner.nextDouble();
        System.out.print("Velocidade de Download (MBPS): ");
        double velocidade = scanner.nextDouble();
        double tempo = arquivo/velocidade * 8;
        double TempoMin = tempo/60;
        System.out.println("O tempo estimado é de "+ TempoMin +" minutos");

        scanner.close();
    }
}
