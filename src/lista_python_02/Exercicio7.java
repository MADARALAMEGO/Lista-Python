package lista_python_02;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite um segundo numero ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite um terceiro numero ");
        double terceiroNumero = scanner.nextDouble();
        if (primeiroNumero > segundoNumero & primeiroNumero > terceiroNumero
                || segundoNumero < primeiroNumero & segundoNumero < terceiroNumero ){
            System.out.println( "O maior numero é o "+ primeiroNumero+ ", e o menor é " +segundoNumero);
        }
        else if (segundoNumero > primeiroNumero & segundoNumero > terceiroNumero
                || terceiroNumero < segundoNumero & terceiroNumero < primeiroNumero ){
            System.out.println("O maior numero é o "+ segundoNumero+ ", e o menor é " +terceiroNumero);
        }
        else if (terceiroNumero > primeiroNumero & terceiroNumero > segundoNumero
                || primeiroNumero < segundoNumero & primeiroNumero < terceiroNumero ){
            System.out.println("O maior numero é o "+terceiroNumero+ ", e o menor é "+primeiroNumero);
        }
        scanner.close();
    }
}
