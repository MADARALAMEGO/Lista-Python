package lista_python_02;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        double aumentoSalarial1 = salarioAtual * 0.2;
        double novoSalario1 = salarioAtual + aumentoSalarial1;
        double aumentoSalarial2 = salarioAtual * 0.15;
        double novoSalario2 = aumentoSalarial2 + salarioAtual;
        double aumentoSalarial3 = salarioAtual * 0.1;
        double novoSalario3 = aumentoSalarial3 + salarioAtual;
        double aumentoSalarial4 = salarioAtual * 0.05;
        double novoSalario4 = aumentoSalarial4 + salarioAtual;
        if (salarioAtual < 280){
            System.out.println("o salário antes do reajuste: " +salarioAtual+ "R$\n");
            System.out.println("O percentual de aumento aplicado: 20% \n");
            System.out.println("valor do aumento: "+ aumentoSalarial1 +"R$ \n");
            System.out.println("O novo salário do funcionário será: "+ novoSalario1+"R$ \n");
        }
        else if (salarioAtual >= 280 & salarioAtual < 700){
            System.out.println("o salário antes do reajuste: " +salarioAtual+ "R$\n");
            System.out.println("O percentual de aumento aplicado: 15% \n");
            System.out.println("valor do aumento: "+ aumentoSalarial2 +"R$ \n");
            System.out.println("O novo salário do funcionário será: "+ novoSalario2+"R$ \n");
        }
        else if (salarioAtual >= 700 & salarioAtual < 1500){
            System.out.println("o salário antes do reajuste: " +salarioAtual+ "R$\n");
            System.out.println("O percentual de aumento aplicado: 10% \n");
            System.out.println("valor do aumento: "+ aumentoSalarial3 +"R$ \n");
            System.out.println("O novo salário do funcionário será: "+ novoSalario3+"R$ \n");
        }
        else if (salarioAtual >= 1500) {
            System.out.println("o salário antes do reajuste: " + salarioAtual + "R$\n");
            System.out.println("O percentual de aumento aplicado: 5% \n");
            System.out.println("valor do aumento: " + aumentoSalarial4 + "R$ \n");
            System.out.println("O novo salário do funcionário será: " + novoSalario4 + "R$ \n");
        }
        scanner.close();
    }
}
