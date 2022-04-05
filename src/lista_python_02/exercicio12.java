package lista_python_02;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua quantia salaria: ");
        double quantiaSalarial = scanner.nextDouble();
        double valorINSS = quantiaSalarial * 0.1;
        double valorFGTS = quantiaSalarial * 0.11;
        double valorIR1 = quantiaSalarial * 0.05;
        double valorIR2 = quantiaSalarial * 0.1;
        double valorIR3 = quantiaSalarial  * 0.2;
        if (quantiaSalarial <= 900){
            System.out.println("Salário Bruto: "+quantiaSalarial+ "R$");
            System.out.println("IR (5%): 0");
            System.out.println("INSS (10%): "+ valorINSS+ "R$");
            System.out.println("FGTS (11%): "+valorFGTS+ "R$");
            System.out.println("Total de descontos: "+valorINSS+"R$");
            System.out.println("Salario Liquido: "
        }

    }
}
