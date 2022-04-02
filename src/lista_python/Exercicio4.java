package lista_python;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1° nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a 2° nota do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3° nota do aluno: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a 4° nota do aluno: ");
        double nota4 = scanner.nextDouble();

        double Soma = nota1+nota2+nota3+nota4;
        byte QuantidadeDeNotas = 4;
        double media = Soma/QuantidadeDeNotas;
        System.out.print("A media do aluno foi: " + media);

        scanner.close();
    }
}
