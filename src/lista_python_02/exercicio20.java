package lista_python_02;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double terceiraNota = scanner.nextDouble();
        double somaDasNotas = primeiraNota + segundaNota + terceiraNota;
        double media = somaDasNotas/3;
        if (media >= 7 & media < 10){
            System.out.println("APROVADO!! :)");
        }
        else if (media < 7){
            System.out.println("REPROVADO! :/");
        }
        else if (media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO!!! B)");
        }
        scanner.close();
    }
}
