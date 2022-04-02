package lista_python;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor recebido por hora: ");
        double SalarioHora = scanner.nextDouble();

        System.out.print("Digite o numero de horas trabalhadas: ");
        double HorasTrabalhadas = scanner.nextDouble();
        double SalarioMensal = (SalarioHora * HorasTrabalhadas * 30);

        System.out.print("O salário mensal do trabalhador é de "+ SalarioMensal + "R$");

    }
}
