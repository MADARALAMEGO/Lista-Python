package lista_python_02;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno: ");
        double primeiraNotaDoAluno = scanner.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double segundaNotaDoAluno = scanner.nextDouble();
        double somaDeNotas = primeiraNotaDoAluno + segundaNotaDoAluno;
        double mediaDoAluno = somaDeNotas / 2;
        System.out.println("A média do aluno foi: "+mediaDoAluno);
        if (mediaDoAluno <= 9.0 || mediaDoAluno >=10.0){

            }
        if (mediaDoAluno <= 7.5 || mediaDoAluno >=9.0){

            }
        else if (mediaDoAluno <= 6.0 || mediaDoAluno >= 7.5){


            }
        else if (mediaDoAluno <= 4.0 || mediaDoAluno >= 6.0){

            }
        else if (mediaDoAluno <= 4.0 || mediaDoAluno >= 0.0){

        }
    }
}
