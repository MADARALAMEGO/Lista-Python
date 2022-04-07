package lista_python_02;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite um segundo numero ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite um terceiro numero ");
        double terceiroNumero = scanner.nextDouble();
        boolean primeiroMaior1 = primeiroNumero > segundoNumero;
        boolean prmeiroMaior2 = primeiroNumero > terceiroNumero;
        boolean segundoMaior1 = segundoNumero > primeiroNumero;
        boolean segundoMaior2 = segundoNumero > terceiroNumero;
        boolean terceiroMaior1 = terceiroNumero > primeiroNumero;
        boolean terceiroMaior2 = terceiroNumero > segundoNumero;
        if (primeiroMaior1 & prmeiroMaior2){
            System.out.println( "O maior numero é o "+ primeiroNumero);
        }
        else if (segundoMaior1 & segundoMaior2){
            System.out.println("O maior numero é o "+ segundoNumero);
        }
        else if (terceiroMaior1 & terceiroMaior2){
            System.out.println("O maior numero é o "+terceiroNumero);
        }
        scanner.close();
    }
}