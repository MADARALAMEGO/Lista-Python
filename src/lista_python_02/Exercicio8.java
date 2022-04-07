package lista_python_02;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto 1: ");
        double primeiroProduto = scanner.nextDouble();
        System.out.print("Informe o valor do produto 2: ");
        double segundoProduto = scanner.nextDouble();
        System.out.print("Informe o valor do produto 3: ");
        double terceiroProduto = scanner.nextDouble();
        if (primeiroProduto < segundoProduto & primeiroProduto < terceiroProduto){
            System.out.println("O produto mais barato é o primeiro, saindo a "+primeiroProduto);
        }
        else if (segundoProduto < primeiroProduto & segundoProduto < terceiroProduto){
            System.out.println("O produto mais barato é o segundo, saindo a "+segundoProduto);
        }
        else if (terceiroProduto < primeiroProduto & terceiroProduto < segundoProduto){
            System.out.println("O produto mais barato é o terceiro, saindo a "+terceiroProduto);
        }
        scanner.close();
    }
}
