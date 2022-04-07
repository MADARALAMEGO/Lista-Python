package lista_python_02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double valorDeA = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorDeB = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double valorDeC = scanner.nextDouble();
        double quadradoDeB = valorDeB * valorDeB;
        double valorDeDelta = quadradoDeB - 4 * valorDeA * valorDeC;
        double raizDelta0 = - valorDeB/ 4 * valorDeA;
        double raizDeltaPositivo1 = - valorDeB + Math.sqrt(valorDeDelta) /4 * valorDeA;
        double raizDeltaPositivo2 = - valorDeB - Math.sqrt(valorDeDelta)/ 4 * valorDeA;
        if (valorDeA == 0){
            System.out.println("EQUAÇÃO DO PRIMEIRO GRAU");
        }
        else if (valorDeDelta < 0){
            System.out.println("DELTA NÃO POSSUI RAIZ");
        }
        else if (valorDeDelta == 0){
            System.out.println("Delta possui um raiz: "+ raizDelta0);
        }
        else if (valorDeDelta > 0){
            System.out.println("Delta possui duas raizes ");
            System.out.println("Raiz 1 = "+raizDeltaPositivo1);
            System.out.println("Raiz 2 = "+ raizDeltaPositivo2);
        }
        scanner.close();
    }
}
